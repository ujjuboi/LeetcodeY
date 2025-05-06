public class BubbleSort {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        for(int i=0; i<args.length-1; i++){
            boolean isSwap = false;
            for(int j=0; j<args.length-1; j++){
                int firstNum = Integer.parseInt(args[j]);
                int secondNum = Integer.parseInt(args[j+1]);
                if(secondNum < firstNum){
                    args[j] = String.valueOf(secondNum);
                    args[j+1] = String.valueOf(firstNum);
                    isSwap = true;
                }
            }
            if(isSwap){
                continue;
            } else {
                break;
            }
        }

        for(String s: args){
            System.out.print(s + " ");
        }
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
}