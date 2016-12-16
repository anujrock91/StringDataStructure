
public class Reverse {
	
	public static String getReverseWords(String s1){
		char []s = s1.toCharArray();
		int left = 0;
		int right = (s1.length()-1);
		while(left<=right){
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			++left;
			--right;
		}
		reverseWord(s);
		return new String(s);
	}
	
	private static void reverseWord(char [] cArr){
		int left=0;
		int right=0;
		while(left < cArr.length && right<cArr.length){
			while(left<cArr.length && !Character.isAlphabetic(cArr[left])){++left;}
			right = left;
			while(right < cArr.length && cArr[right] != ' ' ){right++;}
			--right;
			reverseChars(cArr, left, right);
			left = right+1;
			right = left;
		}
	}
	
	private static void reverseChars(char [] temp, int left, int right){
		while(left<=right){
			char t = temp[left];
			temp[left] = temp[right];
			temp[right] = t;
			++left;
			--right;
		}
	}
}
