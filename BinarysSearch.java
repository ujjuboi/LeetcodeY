import java.util.Scanner;

public class BinarysSearch {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        System.out.println("This is binary search implementation: ");
        System.out.println("Please enter the number you want to search in the sorted array: ");
        Integer[] arg = new Integer[] {45, 50, 75, 87, 90, 95, 98, 112, 113, 114, 456};
        Scanner newScan = new Scanner(System.in);
        int numToSearch = newScan.nextInt();
        newScan.close();
        BinarysSearch p = new BinarysSearch();
        System.out.println("The number is at " + p.binarySearch(numToSearch, arg) + " index of the sorted array.");
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private int binarySearch(int numToSearch, Integer arg[]){
        int index = 0;
        int startIndex = 0;
        int endIndex = arg.length - 1;
        if(arg[endIndex] < numToSearch || arg[startIndex] > numToSearch){
            return -1;
        }
        do {
            int length = endIndex - startIndex;
            switch(length%2){
                case 0:
                    index = startIndex + length/2;
                    break;
                case 1:
                    index = startIndex + length/2 + 1;
                    break;
                default:
                    break;
            }
            if(arg[index] > numToSearch){
                endIndex = index - 1;
            } else {
                startIndex = index + 1;
            }
        } while(!(arg[index] == numToSearch));

        return index;
    }
}
