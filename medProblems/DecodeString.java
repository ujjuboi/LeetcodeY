import java.util.Stack;

public class DecodeString {
  public static void main(String[] args){
    DecodeString ds = new DecodeString();
    System.out.println(ds.decodeString("3[a]2[bc]"));
  }
  public String decodeString(String s) {
        DecodeString so = new DecodeString();
        Stack<String> decode = new Stack<>();
        String outputString = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ']'){
                String tempOutput = "";
                while(!decode.get(decode.size()-1).equals("[")){
                    tempOutput += decode.pop();
                }
                decode.pop();
                tempOutput = so.reverseString(tempOutput);
                String multipleStr = decode.pop();
                try{
                    while(Integer.parseInt(decode.get(decode.size()-1)) < 10){
                        multipleStr += decode.pop();
                    }
                } catch (Exception e){
                    multipleStr = so.reverseString(multipleStr);
                }
                int multiple = Integer.parseInt(multipleStr);
                String tempString = "";
                for(int j=0; j<multiple; j++){
                    tempString += tempOutput;
                }
                decode.push(tempString);
            } else {
                decode.push(String.valueOf(s.charAt(i)));
            }
        }
        for(String i: decode){
            outputString += i;
        }
        return outputString;
    }

    private String reverseString(String s){
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
