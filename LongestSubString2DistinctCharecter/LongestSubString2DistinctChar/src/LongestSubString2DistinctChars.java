import java.util.HashMap;

public class LongestSubString2DistinctChars {
	
	public static String getLongestSubString(String s){
		int left = 0;
		int right = 0;
		int maxLen = 0, maxLeft=0, maxRight=0;
		
		HashMap<Character, Integer> uniqueness = new HashMap<>();
		
		while(right < s.length() && left < s.length() && (left<=right))
		{
			char c = s.charAt(right);
			if(uniqueness.containsKey(c)){
				int value = uniqueness.remove(c);
				uniqueness.put(c, ++value);
				++right;
			}
			else{
				if(uniqueness.size() >= 2){
					int value = uniqueness.get(s.charAt(left));
					--value;
					if(value == 0){
						uniqueness.remove(s.charAt(left));
					}
					else{
						uniqueness.remove(s.charAt(left));
						uniqueness.put(s.charAt(left), value);
					}
					++left;
				}
				else{
					uniqueness.put(c, 1);
					++right;
				}
			}
			
			if(right-left > maxLen){
				maxLen = (right-left);
				maxLeft= left;
				maxRight= right;
			}
		}
		
		return s.substring(maxLeft, maxRight);
	}
}