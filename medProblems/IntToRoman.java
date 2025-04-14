public class IntToRoman {
    public static void main(String[] args){
        int num = 10;
        IntToRoman p = new IntToRoman();
        for(int i =0; i<1; i++){
            System.out.println("once");
        }
        System.out.println(p.intToRoman(num));
    }

    public String intToRoman(int num){
        String romanNumeral = "";
        int operativeNum = 0;
        if(0 > num || num > 3999){
            return romanNumeral;
        }
        //Check for M:
        operativeNum = (num/1000)%10;
        if(operativeNum != 0){
            for(int i=0; i<operativeNum; i++){
                romanNumeral += "M";
            }
        }
        //Check for D and C:
        operativeNum = (num/100)%10;
        if(operativeNum != 0){
            //switch case:
            if(operativeNum == 4){
                romanNumeral += "CD";
            } else if(operativeNum == 9){
                romanNumeral += "CM";
            } else if(operativeNum < 5){
                for(int i=0; i<operativeNum; i++){
                    romanNumeral += "C";
                }
            } else {
                romanNumeral += "D";
                operativeNum = num%500;
                for(int i=0; i<operativeNum/100; i++){
                    romanNumeral += "C";
                }
            }
        }
        //Check for L,X:
        operativeNum = (num/10)%10;
        if(operativeNum != 0){
            if(operativeNum == 4){
                romanNumeral += "XL";
            } else if(operativeNum == 9){
                romanNumeral += "XC";
            } else if(operativeNum < 5){
                for(int i=0; i<operativeNum; i++){
                    romanNumeral += "X";
                }
            } else {
                romanNumeral += "L";
                operativeNum = num%50;
                for(int i=0; i<operativeNum/10; i++){
                    romanNumeral += "X";
                }
            }
        }
        //Check for V and I:
        operativeNum = num%10;
        if(operativeNum == 9){
            romanNumeral += "IX";
        } else if(operativeNum == 4){
            romanNumeral += "IV";
        } else if(operativeNum < 5){
            for(int i=0; i<operativeNum; i++){
                romanNumeral += "I";
            }
        } else {
            romanNumeral += "V";
            operativeNum -= 5;
            for(int i=0; i<operativeNum/1; i++){
                romanNumeral += "I";
            }
        }
        
        return romanNumeral;
    }

}
