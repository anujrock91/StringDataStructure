
public class Read {
	
	private static int pointer = 0;
	private static char text[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
			'q','r','s','t','u','v','w','x','y','z'};
	
	public static int read4(char [] arr) {
		int charLeft = text.length-pointer;
		if(charLeft < 4){
			for(int arrIndex=0;arrIndex<charLeft;arrIndex++){
				arr[arrIndex] = text[pointer];
				++pointer;
			}
			return charLeft;
		}
		else{
			for(int arrIndex=0;arrIndex<4;arrIndex++){
				arr[arrIndex] = text[pointer];
				++pointer;
			}
			return 4;
		}
	}

}
