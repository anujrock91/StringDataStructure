
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ababbaba";
		int [] temp = new LongestPrefixSuffixMatch().LPS(input);
		for(int i : temp){
			System.out.print(i + " || ");
		}
		System.out.println();
		System.out.println(input.substring(input.length() - temp[temp.length -1]));
	}
	
}
