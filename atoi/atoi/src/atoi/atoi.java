package atoi;

import java.lang.Math;

public class atoi {

	public static void main(String[] args) {
		int x = new atoi().atoi("-14");
		int a = 10+x;
		System.out.println(a);
	}
	
	public Integer atoi(String s){
		if(s == null || s.length() == 0){
			return null; 
		}
		else{
			if(validateString(s)){
				String s1 = s.trim();
				int counter = 0;
				int sum = 0;
				if(s1.charAt(0) == '+' || s1.charAt(0) == '-'){
					for(int i=s1.length()-1;i>0;i--){
						sum = sum + ((s1.charAt(i)-'0')*((int)Math.pow(10, counter)));	
						++counter;
					}
					if(s1.charAt(0) == '+'){
						return  1*sum;
					}
					else{
						return -1*sum;
					}
				}
				
				else{
					for(int i=s1.length()-1;i>=0;i--){
						sum = sum + ((s1.charAt(i)-'0')*((int)Math.pow(10, counter)));	
						++counter;
					}
					return sum;
				}
			}
			else{
				return null;
			}
		}
	}
	
	private boolean validateString(String s){
		String temp = s.trim();
		if(temp.charAt(0) == '+' || temp.charAt(0) == '-'){
			if(temp.length()<2) return false;
			for(int i=1;i<temp.length();i++){
				if((temp.charAt(i)-'0') <= 9 && (temp.charAt(i)-'0') >= 0){
					continue;
				}
				else{
					return false;
				}
			}
		}
		else{
			for(int i=0;i<temp.length();i++){
				if((temp.charAt(i)-'0') <= 9 && (temp.charAt(i)-'0') >= 0){
					continue;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
}