import java.util.Scanner;

public class SortingSearch {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        SortingSearch ss = new SortingSearch();
        int[] arr = new int[args.length];
        //testInput for debugging
        // arr = new int[]{12, 457, 895, 14, 742, 45, 421, 546, 324};
        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Please select the sorting algorithm of your choice: ");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        try{
            Scanner s = new Scanner(System.in);
            int algo = s.nextInt();
            switch (algo) {
                case 1:
                    arr = ss.selectionSort(arr);
                    break;
                case 2:
                    arr = ss.bubbleSort(arr);
                    break;
                default:
                System.out.println("Please enter an input between 1 and 2.");
                    s.close();
                    break;
            }
            System.out.println("Please enter your number to search in the array: ");
            int numToSearch = s.nextInt();
            s.close();
            System.out.println("Below is the sorted array: ");
            for(int i: arr){
                System.out.print(i + " ");
            }
            System.out.println("\nThe number you are searching for is at " + ss.binarySearch(arr, numToSearch) + " position in the sorted array.");
        } catch (Exception e){
            System.out.println("Error occured on invalid user input: " + e.getMessage());
        }
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private int[] selectionSort(int[] arr){
        try{
            for(int i=0; i<arr.length-1; i++){
                int smallestNumIndex = i;
                for(int j=i; j<arr.length-1; j++){
                    if(arr[j+1] < arr[smallestNumIndex]){
                        smallestNumIndex = j+1;
                    }
                }
                int smallestNum = arr[smallestNumIndex];
                arr[smallestNumIndex] = arr[i];
                arr[i] = smallestNum;
            }    
        } catch (Exception e){
            System.out.println("Error occured for selection sort: " + e.getMessage());
        }
        return arr;
    }

    private int[] bubbleSort(int[] arr){
        boolean isSwap = false;
        try{
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j] > arr[j+1]){
                        int smallestNum = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = smallestNum;
                        isSwap = true;
                    }
                }
                if(isSwap){
                    continue;
                } else {
                    break;
                }
            }
        } catch(Exception e){
            System.out.println("Error occured for bubble sort: " + e.getMessage());
        }
        return arr;
    }

    private int binarySearch(int[] arr, int numToSearch){
        int index = -1;
        int startIndex = 0;
        int endIndex = arr.length-1;
        int count = 0;
        if(arr[startIndex] > numToSearch || arr[endIndex] < numToSearch){
            return index;
        }
        try{
            do {
                int length = endIndex - startIndex;
                switch (length%2) {
                    case 0:
                        index = startIndex + length/2;    
                        break;
                    default:
                        index = startIndex + (length/2+1);
                        break;
                }
                if(arr[index] == numToSearch){
                    return index;
                } else if(arr[index] > numToSearch){
                    endIndex = index - 1;
                } else {
                    startIndex = index + 1;
                }
                count++;
            } while(count <= arr.length);
        } catch(Exception e){
            System.out.println("Error occured for binary search: " + e.getMessage());
        }
        return -1;
    }
}
