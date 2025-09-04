package LinkedList;

public class LinkedList {

  public class Node{
    int value;
    Node next;

    public Node(int value){
      this.value = value;
    }
  
  }

  private Node head;
  private Node tail;
  private int length;

  public LinkedList(int value){
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length++;
  }

  public Node getHead(){
    return head;
  }

  public Node getTail(){
    return tail;
  }

  public int getLength(){
    return length;
  }

  public void append(int value){
    Node newNode = new Node(value);
    tail.next = newNode;
    tail = newNode;
    length++;
  }

  public void preppend(int value){
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
    length++;
  }

  public void printList(LinkedList ll){
    Node pointerNode = ll.getHead();
    for(int i=0; i<length; i++){
      System.out.println(pointerNode.value);
      pointerNode = pointerNode.next;
    }
  }

  public void insertInBetween(LinkedList ll, int index, int value){
    Node pointerNode = ll.getNode(ll, index-1);
    Node newNode = new Node(value);
    newNode.next = pointerNode.next;
    pointerNode.next = newNode; 
    length++;
  }

  public Node getNode(LinkedList ll, int index){
    Node pointerNode = ll.getHead();
    for(int i=0; i<index; i++){
      pointerNode = pointerNode.next;
    }
    return pointerNode;
  }

  public void deleteNode(LinkedList ll, int index){
    if(index == 0){
      //Fix this: 
      Node head = ll.getHead();
      head = head.next;
    } else {
      Node beforNode = ll.getNode(ll, index-1);
      Node afterNode = ll.getNode(ll, index+1);
      Node indexNode = ll.getNode(ll, index);
      indexNode.next = null;
      beforNode.next = afterNode;
    }
    length--;
  }
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      LinkedList ll = new LinkedList(4);
      ll.append(0);
      ll.append(7);
      ll.append(8);
      ll.printList(ll);
      ll.preppend(-8);
      System.out.println("After preppend: ");
      ll.printList(ll);
      System.out.println("Insert at between: ");
      ll.insertInBetween(ll, 2, 6);
      ll.printList(ll);
      System.out.println("After Deletion: ");
      ll.deleteNode(ll, 0);
      ll.printList(ll);
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
}
