package isPalindrome;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String s1){
		String s = s1.toLowerCase();
		int left = 0;
		int right = s.length()-1;
		
		while(left <= right){
			while(!isValidChar(s.charAt(left))){++left;}
			while(!isValidChar(s.charAt(right))){--right;}
			if(left<=right){
				if(s.charAt(left) == s.charAt(right)){
					++left;
					--right;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	private static boolean isValidChar(char c){
		if(c-'0' >= 0 && c-'0' <=9){
			return true;
		}
		else if(c-'a' >=0 && c-'a' < 26){
			return true;
		}
		else if(c-'A' >=0 && c-'A' < 26){
			return true;
		}
		return false;
	}
}
