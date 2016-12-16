package Snippet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberToLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = new PhoneNumberToLetter().PhoneNumToLetter("234");
		for(String s: result){
			System.out.print(s + " | ");
		}
		System.out.println();
	}
	
	public List<String> PhoneNumToLetter(String number){
		HashMap<Character, String> numberToLetterMap = new HashMap<Character, String>();  
		numberToLetterMap.put('0', "");numberToLetterMap.put('1', "");numberToLetterMap.put('2', "abc");
		numberToLetterMap.put('3', "def");numberToLetterMap.put('4', "ghi");numberToLetterMap.put('5', "jkl");
		numberToLetterMap.put('6', "mno");numberToLetterMap.put('7', "pqrs");numberToLetterMap.put('8', "tuv");
		numberToLetterMap.put('9', "wxyz");
		ArrayList<String> resultSet = new ArrayList<>();
		ArrayList<Character> tempSet = new ArrayList<>();
		DFS(number, numberToLetterMap, tempSet, resultSet);
		return resultSet;
	}
	
	
	public void DFS(String digit, HashMap<Character,String> numToLetter, ArrayList<Character> temp, ArrayList<String> result){
		//if one has reached the minimum level then we can stop
		if(digit.length() == 0){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<temp.size();i++){
				sb.append(temp.get(i));
			}
			result.add(sb.toString());
			return;
		}
		//for each element in level i
		//Visit all children of element i in level i+1
		String parent = numToLetter.get(digit.charAt(0));
		for(int i=0;i<parent.length();i++){
			char node = parent.charAt(i);
			temp.add(node);
			//For each node in parent visit its children
			DFS(digit.substring(1), numToLetter, temp, result);
			temp.remove(temp.size()-1);
		}
	}

}
