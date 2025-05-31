package easyProblems;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorString {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        GreatestCommonDivisorString gm = new GreatestCommonDivisorString();
        System.out.println(gm.approachTwo("ABABAB", "ABAB"));
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

    private String approachTwo(String str1, String str2){
        int divisor = 1;
        List<Integer> divisors = new ArrayList<>();
        int max = str1.length();
        if(str1.length() < str2.length()){
            max = str2.length();
        }
        do {
            if(str1.length()%divisor == 0 && str2.length()%divisor == 0){
                String prefix = str2.substring(0, divisor);
                for(int i=1; i<str1.length()/divisor; i++){
                    prefix += str2.substring(0, divisor);
                }
                if(prefix.equals(str1)){
                    prefix = str1.substring(0, divisor);
                    for(int i=1; i<str2.length()/divisor; i++){
                        prefix += str1.substring(0, divisor);
                    }
                    if(prefix.equals(str2)){
                        divisors.add(divisor);
                    }
                }
            }
            divisor++;
        } while (divisor <= max);
        if(divisors.size() > 0){
            return str1.substring(0, divisors.get(divisors.size()-1));
        } 
        return "";
    }
}
