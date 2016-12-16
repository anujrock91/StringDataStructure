
public class ReadN {
	
	public static int readN(char arr [], int n){
		int totalRead = 0;
		int inputIndex = 0;
		if(n==0){
			return 0;
		}
		else{
			while(true){
				
			
			char [] temp = new char [4];
			int readNum = Read.read4(temp);
			totalRead = totalRead + readNum;
			if(readNum < 4){
				if(totalRead > n){
					int rem = (totalRead- n);
					for(int i=0;i<readNum-rem;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
					break;
				}
				else if(totalRead == n){
					for(int i=0;i<readNum;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
					break;
				}
				else{
					for(int i=0;i<readNum;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
					break;
				}
			}
			else{
				if(totalRead < n){
					for(int i=0;i<4;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
				}
				else if(totalRead == n){
					for(int i=0;i<4;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
					break;
				}
				else{
					int rem = totalRead-n;
					for(int i=0;i<4-rem;i++){
						arr[inputIndex] = temp[i];
						++inputIndex;
					}
					break;
				}
			}
			
			
			
		}
		}
		
		return inputIndex;
	}
}
