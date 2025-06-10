package easyProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        ValidParanthesis p = new ValidParanthesis();
        System.out.println(p.isValid("()[]{}}"));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
       
    private boolean isValid(String s) {
        Stack<Character> validStack = new Stack<>();
        Map<Character, Character> scopeMap = new HashMap<>();
        scopeMap.put('(', ')');
        scopeMap.put('{', '}');
        scopeMap.put('[',']');
        // System.out.println(scopeMap.keySet());
        for(int i=0; i<s.length(); i++){
            if(scopeMap.keySet().contains(s.charAt(i))){
                validStack.push(s.charAt(i));
            } else {
                if(validStack.isEmpty()){
                    return false;
                } else {
                    char toCloseScope = scopeMap.get(validStack.get(validStack.size() - 1));
                    if(toCloseScope == s.charAt(i)){
                        validStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        // System.out.println("stack: " + validStack);
        return validStack.isEmpty();
    }
}
