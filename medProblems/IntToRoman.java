public class IntToRoman {
    public static void main(String[] args){
        int num = 1;
        IntToRoman p = new IntToRoman();
        System.out.println(p.intToRoman(num));
    }

    public String intToRoman(int num) {
        int operativeNum = 0;
        String romanNumeral = "";
        if(1 > num || num > 3999){
            return romanNumeral;
        }
        //Check for M:
        operativeNum = (num/1000)%10;
        for(int i=0; i<operativeNum; i++){
            romanNumeral += "M";
        }
        //Check for D and C:
        operativeNum = (num/100)%10;
        switch(operativeNum){
            case 9:
                romanNumeral += "CM";
                break;
            case 4:
                romanNumeral += "CD";
                break;
            default:
                if(operativeNum >= 5){
                    romanNumeral += "D";
                    operativeNum -= 5;
                } 
                for(int i=0; i<operativeNum; i++){
                    romanNumeral += "C";
                }
                break;
        }
        //Check for L and X:
        operativeNum = (num/10)%10;
        switch(operativeNum){
            case 9:
                romanNumeral += "XC";
                break;
            case 4:
                romanNumeral += "XL";
                break;
            default:
                if(operativeNum >= 5){
                    romanNumeral += "L";
                    operativeNum -= 5;
                } 
                for(int i=0; i<operativeNum; i++){
                    romanNumeral += "X";
                }
                break;
        }
        //Check for V and I:
        operativeNum = num%10;
        switch(operativeNum){
            case 9:
                romanNumeral += "IX";
                break;
            case 4:
                romanNumeral += "IV";
                break;
            default:
                if(operativeNum >= 5){
                    romanNumeral += "V";
                    operativeNum -= 5;
                } 
                for(int i=0; i<operativeNum; i++){
                    romanNumeral += "I";
                }
                break;
        }
        return romanNumeral;
    }
}
