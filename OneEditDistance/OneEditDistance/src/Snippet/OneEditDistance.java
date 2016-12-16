package Snippet;

import java.util.Scanner;

public class OneEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanObj1 = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = scanObj1.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2 = scanObj1.nextLine();
		scanObj1.close();
		System.out.println(new OneEditDistance().isOneEdit(s1, s2));
		
	}
	
	public boolean isOneEdit(String s1, String s2){
		int count = 0;
		if((s1.length()-s2.length() >= 2) || (s1.length()-s2.length()<= -2)){
			return false;
		}
		else{
			if(s1.length()==s2.length()){
				int pointer = 0;
				while(pointer < s1.length()){
					if(s1.charAt(pointer) != s2.charAt(pointer)){
						++count;
					}
					++pointer;
				}
			}
			else{
				String longerString = s1.length()>s2.length()?s1:s2;
				String shorterString = s1.length()<s2.length()?s1:s2;
				int longerPointer = s1.length()>s2.length()?(s1.length()-1):(s2.length()-1);
				int shorterPointer = s1.length()<s2.length()?(s1.length()-1):(s2.length()-1);
				while(longerPointer>=0 && shorterPointer>=0){
					if(longerString.charAt(longerPointer) == shorterString.charAt(shorterPointer)){
						--longerPointer;
						--shorterPointer;
					}
					else{
						--longerPointer;
						++count;
					}
				}
			}
		}
		
		if(count > 1){
			return false;
		}
		else{
			return true;
		}
	}

}
