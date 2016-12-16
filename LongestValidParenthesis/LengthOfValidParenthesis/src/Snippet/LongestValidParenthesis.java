package Snippet;
import java.util.*;
public class LongestValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestValidParenthesis().getLongestParenthesisLength(")()())"));
	}
	
	private class BracketInfo{
		char style;
		int index;
		public BracketInfo(char s, int i){
			this.style = s;
			this.index = i;
		}
	}
	
	
	
	public int getLongestParenthesisLength(String pattern){
		Stack<BracketInfo> bracketStack = new Stack<>();
		HashMap<Character, Character> bracket = new HashMap<>();
		bracket.put(')', '(');
		int start = 0;
		while(start < pattern.length()){
			BracketInfo obj = new BracketInfo(pattern.charAt(start), start);
			if(obj.style == ')'){
				if(bracketStack.isEmpty() || bracketStack.peek().style != bracket.get(obj.style)){
					bracketStack.push(obj);
				}
				else{
					bracketStack.pop();
				}
				++start;
			}
			else{
				bracketStack.push(obj);
				++start;
			}
		}
		
		if(bracketStack.isEmpty()){
			return pattern.length();
		}
		else{
			BracketInfo prev = null;
			int max = 0;
			while(!bracketStack.isEmpty()){
				int len = 0;
				if(prev == null){
					prev = bracketStack.pop();
					int leftIndex = prev.index;
					int rightIndex = (pattern.length()-1);
					len = (rightIndex-leftIndex);
				}
				else{
					BracketInfo obj = bracketStack.pop();
					int leftIndex = obj.index;
					int rightIndex = prev.index;
					len = (rightIndex-leftIndex-1);
					prev = obj;
				}
				max = Math.max(max, len);
			}
			max = Math.max(max, prev.index);
			return max;
		}	
	}
	
	

}