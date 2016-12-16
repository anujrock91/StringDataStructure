
public class ShortestPalindrome {
	
	public String getShortestPalindrome(String s){
		StringBuilder rev = new StringBuilder(s).reverse();
		String org_rev = s+rev;
		int lps = getLengthofLongestSuffix(org_rev);
		StringBuilder prev = new StringBuilder(s.substring(lps)).reverse();
		return prev+s;
	}
	
	private int getLengthofLongestSuffix(String s){
		int lps[] = new int[s.length()];
		int j=0;
		
		for(int i=1;i<s.length();i++){
			if(s.charAt(i) == s.charAt(j)){
				lps[i] = (lps[i-1]+1);
				++j;
			}
			else{
				while(j>0){
					j = lps[j-1];
					if(s.charAt(j) == s.charAt(i)){
						lps[i] = lps[j]+1;
						break;
					}
					else{
						continue;
					}
				}
			}
		}
		return lps[s.length()-1];
	}
}
