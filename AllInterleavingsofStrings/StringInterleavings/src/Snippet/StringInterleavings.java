package Snippet;
import java.util.*;

public class StringInterleavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = new StringInterleavings().getInterleavings("aabcc", "dbbca");
		for(String s: result){
			System.out.print(s + " | ");
		}
		System.out.println();
	}
	
	public List<String> getInterleavings(String s1, String s2){
		ArrayList<Character> left = new ArrayList<>();
		ArrayList<Character> right = new ArrayList<>();
		ArrayList<Character> temp = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<s1.length();i++){
			left.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			right.add(s2.charAt(i));
		}
		interleave(left, right, temp, result);
		return result;
	}
	
	private void interleave(ArrayList<Character> leftList, ArrayList<Character> rightList, ArrayList<Character> tempList, ArrayList<String> resultList){
		if(leftList.size() == 0 || rightList.size() == 0){
			resultList.add(construct(leftList, rightList, tempList));
			return;
		}
		else{
			tempList.add(leftList.remove(0));
			interleave(leftList, rightList, tempList, resultList);
			Character c1  = tempList.remove(tempList.size()-1);
			leftList.add(0, c1);
			
			tempList.add(rightList.remove(0));
			interleave(leftList, rightList, tempList, resultList);
			Character c2  = tempList.remove(tempList.size()-1);
			rightList.add(0, c2);
		}
	}
	
	private String construct(ArrayList<Character> left, ArrayList<Character> right, ArrayList<Character> temp){
		StringBuilder sb = new StringBuilder();
		for(Character c: temp){
			sb.append(c);
		}
		if(left.size() == 0){
			for(Character c: right){
				sb.append(c);
			}	
		}
		else if(right.size() == 0){
			for(Character c: left){
				sb.append(c);
			}
		}
		return sb.toString();
	}

}