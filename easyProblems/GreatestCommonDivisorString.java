package easyProblems;

public class GreatestCommonDivisorString {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        GreatestCommonDivisorString gm = new GreatestCommonDivisorString();
        System.out.println(gm.cdOfStrings("LEET", "CODE"));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private String cdOfStrings(String str1, String str2) {
        String shorterString = str1;
        String largerString = str2;
        if(str1.length() > str2.length()){
            shorterString = str2;
            largerString = str1;
        }
        int min = shorterString.length();
        int max = largerString.length();
        int divisor = min;
        String baseString = "";
        do {
            baseString = largerString.substring(0, divisor);
            boolean flag1 = false, flag2 = false;
            for(int i=1; i<shorterString.length()/divisor; i++){
                baseString = baseString.concat(largerString.substring(0, divisor));
            }
            if(baseString.equals(shorterString)){
                flag1 = true;
                baseString = largerString.substring(0, divisor);
            }
            for(int i=1; i<largerString.length()/divisor; i++){
                baseString = baseString.concat(largerString.substring(0, divisor));
            }
            if(baseString.equals(largerString)){
                flag2 = true;
                baseString = largerString.substring(0, divisor);
            }
            if(flag1 && flag2){
                return baseString;
            } 
            divisor--;
        } while(divisor != 0);
        return "";
    }
}
