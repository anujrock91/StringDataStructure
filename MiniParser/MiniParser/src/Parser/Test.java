package Parser;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner obj = new Scanner(System.in);
		String s=obj.nextLine();
		Parser p = new Parser();
		NestedInteger objParsed = p.specifyString(s);
		NestedInteger temp = objParsed;
		while(temp != null){
			System.out.println(temp.selfValue);
			temp = temp.nestedObject;
			System.out.println("---------");
		}
	}

}
