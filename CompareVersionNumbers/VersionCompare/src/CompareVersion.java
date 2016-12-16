
public class CompareVersion {
	
	public static int getVersionResult(String s1, String s2){
		String s1Split [] = s1.split("\\.");
		String s2Split[] = s2.split("\\.");
		int index = 0;
		while(index < s1Split.length && index < s2Split.length){
			if(Integer.parseInt(s1Split[index]) == Integer.parseInt(s2Split[index])){
				++index;
			}
			else if(Integer.parseInt(s1Split[index]) < Integer.parseInt(s2Split[index])){
				return -1;
			}
			else{
				return 1;
			}
		}
		
		while(index < s1Split.length){
			if(Integer.parseInt(s1Split[index]) != 0){
				return 1;
			}
			++index;
		}
		while(index < s2Split.length){
			if(Integer.parseInt(s2Split[index]) != 0){
				return -1;
			}
			++index;
		}
		
		return 0;
	}
}