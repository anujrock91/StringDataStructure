
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLastWordLength("Hello World "));
	}
	
	public static int getLastWordLength(String s){
		int end = (s.length()-1);
		int startCount = 0;
		while(s.charAt(end) == ' '){
			--end;
		}
		startCount = end;
		while(startCount>= 0 && s.charAt(startCount) != ' '){
			--startCount;
		}
		return (end-startCount);
	}

}
