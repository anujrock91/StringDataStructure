
public class IntegerToWords {
	private static String primitiveNums[] = {"", "one", "two","three", "four", "five" ,"six", "seven", "eight" , "nine", "ten" ,
			"eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen" , "seventeen" ,"eighteen" ,"nineteen","twenty"};
	private static String tens[]={"","","twenty", "thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	private static String hundreds[]= {"","thousand","million","billion"};
	
	public static String numberToWords(int num) {
        int quo = 0;
        int rem = 0;
        String word = "";
        quo=(num/1000);
        rem=(num%1000);
        int count = 0;
        while(rem!=0){
        	word = construct(rem) + " " + hundreds[count] + " "+word;
        	++count;
        	rem = (quo%1000);
        	quo = (quo/1000);
        }
        if(word.trim().length() == 0){
        	return "zero";
        }
		return word;
    }	
	
	
	private static String construct(int num){
		int quo=(num/100);
		int rem=(num%100);
		String word = "";
		if(quo == 0){
			word = primitiveNums[quo] + " " + contructTens(rem);
		}
		else{
			word = primitiveNums[quo] + " hundred " + contructTens(rem);
		}
		return word;
	}
	
	private static String contructTens(int num){
		if(num < 21){
			return primitiveNums[num];
		}
		int quo = (num/10);
		int rem = (num%10);
		return (tens[quo]+" "+primitiveNums[rem]);
	}
	
}