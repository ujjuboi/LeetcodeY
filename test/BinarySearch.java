import java.util.Scanner;

public class BinarySearch {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        BinarySearch b = new BinarySearch();
        int[] arr = new int[args.length];
        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        Scanner s = new Scanner(System.in);
        int numToSearch = s.nextInt();
        s.close();
        System.out.println("The number you are searching for in the sorted is at: " + b.binarySearch(arr, numToSearch) + " position.");
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private int binarySearch(int[] arr, int numToSearch) {
        int index = 0;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int count = 0;
        if(numToSearch > arr[endIndex] || numToSearch < arr[startIndex]) {
            return -1;
        }
        do {
            int length = endIndex - startIndex;
            switch(length%2) {
                case 0: 
                    index = startIndex + length/2;
                    break;
                case 1:
                    index = startIndex + (length/2+1);
                    break;
                default:
                    break;
            }
            if(arr[index] == numToSearch) {
                return index+1;
            } else if(arr[index] > numToSearch) {
                endIndex = index - 1;
            } else {
                startIndex = index + 1;
            }
            count++;
        } while(count < arr.length);
        return -1;
    }
}
