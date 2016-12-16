package Snippet;


public class CountAndSay {

	public static void main(String args[]){
		System.out.println(countAndSay("21"));
	}
	
	public static String countAndSay(String num){
		StringBuilder sb = new StringBuilder();
		char temp = num.charAt(num.length()-1);
		int count = 0;
		for(int i=(num.length()-1) ; i >= 0 ; i--){
			if(num.charAt(i) == temp){
				sb.append(num.charAt(i));
				++count;
			}
			else{
				sb.append(count);
				temp = num.charAt(i);
				count = 1;
				sb.append(num.charAt(i));
			}
		}
		
		sb.append(count);
		return sb.reverse().toString();
	}
}