import java.util.concurrent.TimeUnit;

public class SelectionSort {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        System.out.println("This is Selection Sort Implementation in Java");
        for(int i=0; i<args.length-1; i++){
            int index = i;
            for(int j=i; j<args.length-1; j++){
                //First Unsorted Loop:
                if(Integer.parseInt(args[j+1]) < Integer.parseInt(args[j])){
                    index = j+1;
                }
            }
            String swap1 = args[i];
            args[i] = args[index];
            args[index] = swap1;
        }
        for(String i: args){
            System.out.print(i + " ");
        }

        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) +  " ms");
    }
    
    
}
