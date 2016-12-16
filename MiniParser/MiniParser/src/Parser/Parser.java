package Parser;

import java.util.Stack;

public class Parser {
	
	public NestedInteger specifyString(String s){
		NestedInteger returnObj = new NestedInteger();
		Stack tempStack = new Stack();
		String temp = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == '['){
				tempStack.push(new NestedInteger());
			}
			else if(s.charAt(i) == ','){
				if(!temp.equals("")){
					NestedInteger obj = (NestedInteger)tempStack.peek();
					obj.selfValue.add(Integer.parseInt(temp));
				}
				temp = "";
			}
			else if(s.charAt(i) == ']'){
				if(!temp.equals("")){
					NestedInteger obj = (NestedInteger)tempStack.peek();
					obj.selfValue.add(Integer.parseInt(temp));
				}
				
				NestedInteger obj = (NestedInteger)tempStack.pop();
				if(!tempStack.isEmpty()){
					NestedInteger parentObj = (NestedInteger)tempStack.peek();
					parentObj.nestedObject = obj;
				}
				else{
					returnObj = obj;
				}
				temp = "";
			}
			else{
				temp = temp + s.charAt(i);
			}
		}
		 
		if(!temp.equals("")){
			NestedInteger obj = new NestedInteger();
			obj.selfValue.add(Integer.parseInt(temp));
			returnObj = obj;
		}
		
		return returnObj;
		
	}
}