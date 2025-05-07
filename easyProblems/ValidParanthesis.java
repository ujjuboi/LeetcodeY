package easyProblems;

public class ValidParanthesis {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        ValidParanthesis p = new ValidParanthesis();
        System.out.println(p.isValid("()[]{}}"));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
       
    public boolean isValid(String s) {
        String newString = s;
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    newString = newString.replaceFirst("\\)", "");
                    newString = newString.replaceFirst("\\(", "");
                    break;
                case '{':
                    newString = newString.replaceFirst("\\}", "");
                    newString = newString.replaceFirst("\\{", "");
                    break;
                case '[':
                    newString = newString.replaceFirst("\\]", "");
                    newString = newString.replaceFirst("\\[", "");
                    break;
            }
        }
        if(newString.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
