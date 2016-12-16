
public class Reverse {
	
	public static String reverseVowels(String s){
		return reverseVowels(s, 0, s.length()-1);
	}
	
	private static String reverseVowels(String temp, int left, int right){
		char tempArr[]  = temp.toCharArray();
		while(left<right){
			while(!isVowel(tempArr[left])){++left;}
			while(!isVowel(tempArr[right])){--right;}
			if(left<=right){
				char tempChar = tempArr[left];
				tempArr[left] = tempArr[right];
				tempArr[right] = tempChar;
				++left;
				--right;
			}
		}
		return new String(tempArr);
	}
	
	private static boolean isVowel(char c){
		if(c == 'a' || c=='e' || c=='i' || c == 'o' || c == 'u'){
			return true;
		}
		else if(c == 'A' || c=='E' || c=='I' || c == 'O' || c == 'U'){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static String reverseString(String s){
		char [] tempArr = s.toCharArray();
		int left = 0;
		int right = (s.length()-1);
		while(left<right){
			char temp = tempArr[left];
			tempArr[left] = tempArr[right];
			tempArr[right] = temp;
			++left;
			--right;
		}
		return new String(tempArr);
	}
	
}
