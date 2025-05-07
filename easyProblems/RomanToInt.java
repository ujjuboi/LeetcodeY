package easyProblems;
//https://leetcode.com/problems/roman-to-integer/description/

public class RomanToInt {
    public static void main(String[] args){
        RomanToInt p = new RomanToInt();
        System.out.println(p.romanToInt("DCXXI"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == ('V')){
                            sum += 4;
                            i += 1;
                            break;
                        } else if(s.charAt(i+1) == ('X')){
                            sum += 9;
                            i += 1;
                            break ;       
                        } else {
                            sum += 1;
                            break;
                        }
                    } else {
                        sum += 1;
                        break;
                    }
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == ('L')){
                            sum += 40;
                            i += 1;
                            break;
                        } else if(s.charAt(i+1) == ('C')){
                            sum += 90;
                            i += 1;
                            break;        
                        } else {
                            sum += 10;
                            break;
                        }
                    } else { 
                        sum += 10;
                        break;
                    }
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == ('D')){
                            sum += 400;
                            i += 1;
                            break;
                        } else if(s.charAt(i+1) == ('M')){
                            sum += 900;
                            i += 1;
                            break;        
                        } else {
                            sum += 100;
                            break;
                        }
                    } else {
                        sum += 100;
                        break;
                    }
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}