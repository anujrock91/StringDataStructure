package Snippet;
import java.util.HashMap;

public class SubStringWithNoRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SubStringWithNoRepeat().getLongestSubStringWithoutRepeat("bc"));
	}

	public String getLongestSubStringWithoutRepeat(String s){
		String temp = new String(s);
		if(temp.length() == 1){
			return temp;
		}
		else if(temp.length() == 2){
			return temp.charAt(0)==temp.charAt(1)?""+temp.charAt(0):temp;
		}
		
		int left = 0,right = 0;
		String finalResult = "";
		String tempOutput = "";
		HashMap<Character, Integer> storage = new HashMap<>();
		while(left< temp.length() && right < temp.length()){
			if(!storage.containsKey(temp.charAt(right))){
				tempOutput = tempOutput + temp.charAt(right);
				storage.put(temp.charAt(right), 1);
				if(finalResult.length() < tempOutput.length()){
					finalResult = tempOutput;
				}
				++right;
			}
			else if(storage.containsKey(temp.charAt(right))){
				storage.remove(temp.charAt(left));
				++left;
				tempOutput = temp.substring(left, right);
			}
		}
		return finalResult;
	}
}