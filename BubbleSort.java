public class BubbleSort {
    public static void main(String[] args){
        System.out.println("This is a Bubble Sort Code Implementation.");
        for(int i=0; i<args.length-1; i++){
            for(int j=0; j<args.length-1; j++){
                int firstNum = Integer.parseInt(args[j]);
                int secondNum = Integer.parseInt(args[j+1]);
                if(firstNum > secondNum){
                    args[j+1] = String.valueOf(firstNum);
                    args[j] = String.valueOf(secondNum);
                } else {
                    continue;
                }
            }
        }
        for(String i: args){
            System.out.print(i + " ");
        }
    }
}