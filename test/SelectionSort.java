public class SelectionSort {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        for(int i=0; i<args.length-1; i++){
            int smallesIndex = i;
            for(int j=i; j<args.length-1; j++){
                if(Integer.parseInt(args[smallesIndex]) > Integer.parseInt(args[j+1])){
                    smallesIndex = j+1;
                }
            }
            String smallestNum = args[smallesIndex];
            args[smallesIndex] = args[i];
            args[i] = smallestNum;

        }
        for(String s : args){
            System.out.print(s + " ");
        }
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
}
