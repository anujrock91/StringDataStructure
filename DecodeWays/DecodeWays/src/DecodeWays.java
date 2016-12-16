import java.util.HashMap;

public class DecodeWays {
	
	private HashMap<Integer, Character> alphabetMap;
	
	public DecodeWays(){
		alphabetMap = new HashMap<>();
		alphabetMap.put(1, 'A');alphabetMap.put(10, 'J');alphabetMap.put(19, 'S');
		alphabetMap.put(2, 'B');alphabetMap.put(11, 'K');alphabetMap.put(20, 'T');
		alphabetMap.put(3, 'C');alphabetMap.put(12, 'L');alphabetMap.put(21, 'U');
		alphabetMap.put(4, 'D');alphabetMap.put(13, 'M');alphabetMap.put(22, 'V');
		alphabetMap.put(5, 'E');alphabetMap.put(14, 'N');alphabetMap.put(23, 'W');
		alphabetMap.put(6, 'F');alphabetMap.put(15, 'O');alphabetMap.put(24, 'X');
		alphabetMap.put(7, 'G');alphabetMap.put(16, 'P');alphabetMap.put(25, 'Y');
		alphabetMap.put(8, 'H');alphabetMap.put(17, 'Q');alphabetMap.put(26, 'Z');
		alphabetMap.put(9, 'I');alphabetMap.put(18, 'R');
	}
	
	public int getDecodeWays(String s){
		int sum = 0;
		if(s.length() == 0 ){
			return 1;
		}
		else{
			for(int i=1;i<=s.length();i++){
				String begin = s.substring(0,i);
				String rem = s.substring(i, s.length());
				if(alphabetMap.containsKey(Integer.parseInt(begin))){
					sum = sum + getDecodeWays(rem);
				}
				else{
					break;
				}
			}
			return sum;
		}
	}
}
