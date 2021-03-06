package Snippet;
import java.util.*;

public class ZigZagConversion {
	
	public static void main(String [] args){
		System.out.println(convert("abcd", 3));
	}
	
	
	public static String convert(String s, int rows){
		int rowCount = 0;
		int switchFlag = 0;
		
		if(rows == 1){
			return s;
		}
		
		ArrayList<ArrayList<Character>> zigzag = new ArrayList<>();
		for(int i=0;i<rows;i++){
			ArrayList<Character> newList = new ArrayList<>();
			zigzag.add(newList);
		}
		for(int i=0;i<s.length();i++){
			
				if(switchFlag == 0){
					zigzag.get(rowCount).add(s.charAt(i));
					++rowCount;
					if(rowCount < (rows-1)){
						continue;
					}
					else{
						switchFlag = 1;
					}
				}
				else if(switchFlag == 1){
					zigzag.get(rowCount).add(s.charAt(i));
					--rowCount;
					if(rowCount > 0){
						continue;
					}
					else{
						switchFlag = 0;
					}
				}		
		}
		
		StringBuilder sb = new StringBuilder();
		for(ArrayList<Character> al : zigzag){
			for(Character c : al){
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
