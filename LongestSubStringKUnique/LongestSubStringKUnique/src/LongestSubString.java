import java.util.ArrayList;
import java.util.*;

public class LongestSubString {
	
	private static HashSet<String> SubStrings = new HashSet<>();
	
	public static HashSet<String> getSubStrings(int uniqueElements, String s){
		int head = 0;
		int mobilePointer = head;
		int len=0;
		int max = 0;
		HashMap<Character, Integer> elementMap =  new HashMap<Character, Integer>();
		while(head < s.length() && mobilePointer < s.length()){
			if(!elementMap.containsKey(s.charAt(mobilePointer))){
				if(elementMap.size() < uniqueElements){
					++len;
					elementMap.put(s.charAt(mobilePointer), 1);
					++mobilePointer;
				}
				else{
					if(len > max){
						max = len;
						SubStrings.removeAll(SubStrings);
						SubStrings.add(s.substring(head, mobilePointer));
						//longestSubStrings.removeAll(longestSubStrings);
						//longestSubStrings.add(s.substring(head, mobilePointer));
					}
					if(len == max){
						max = len;
						SubStrings.add(s.substring(head, mobilePointer));
						//longestSubStrings.add(s.substring(head, mobilePointer));
					}
					--len;
					Integer value = elementMap.get(s.charAt(head));
					--value;
					if(value <= 0){
						elementMap.remove(s.charAt(head));
					}
					else{
						elementMap.put(s.charAt(head), value);
					}
					++head;
				}
			}
			
			else{
				++len;
				Integer value = elementMap.get(s.charAt(mobilePointer));
				++value;
				elementMap.put(s.charAt(mobilePointer), value);
				++mobilePointer;
			}
		}
		
		if(len>max){
			//longestSubStrings.removeAll(longestSubStrings);
			//longestSubStrings.add(s.substring(head,mobilePointer));
			SubStrings.removeAll(SubStrings);
			SubStrings.add(s.substring(head,mobilePointer));
		}
		else if(len==max){
			//longestSubStrings.add(s.substring(head, mobilePointer));
			SubStrings.add(s.substring(head, mobilePointer));
		}
		
		return SubStrings;
	}
}
