package Snippet;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
	
	public static void main(String [] args){
		System.out.println(isValid("([)]"));
	}
	
	public static boolean isValid(String s){
		HashMap<Character,Character> brackets = new HashMap<>();
		brackets.put('[', ']');
		brackets.put('{', '}');
		brackets.put('(', ')');
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
				if(stack.isEmpty() || brackets.get(stack.peek()) != s.charAt(i)){ return false; }
				else{
					stack.pop();
				}
			}
			else{
				stack.push(s.charAt(i));
			}
		}	
		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}