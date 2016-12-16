import java.util.ArrayList;

public class GenerateParenthesisPermutations {
	
	public ArrayList<String> getParenthesisPermutations(int n){
		ArrayList<Character> leftParen = new ArrayList<>();
		ArrayList<Character> rightParen = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		if(n==0){
			return result;
		}
		for(int i=0;i<n;i++){
			leftParen.add('(');
			rightParen.add(')');
		}
		getParenthesisPermutations(leftParen, rightParen, new ArrayList<>(), result);
		return result;
	}
	
	private void getParenthesisPermutations(ArrayList<Character> left, ArrayList<Character> right, ArrayList<Character>temp, ArrayList<String> result){
		if(left.size() == right.size()){
			temp.add(temp.size(), left.remove(0));
			getParenthesisPermutations(left, right, temp, result);
			left.add(temp.remove(temp.size()-1));
		}
		else if(left.size() == 0 || right.size() == 0){
			constructResult(left, right, temp, result);
		}
		else{
			temp.add(temp.size(), left.remove(0));
			getParenthesisPermutations(left, right, temp, result);
			left.add(temp.remove(temp.size()-1));
			temp.add(temp.size(), right.remove(0));
			getParenthesisPermutations(left, right, temp, result);
			right.add(temp.remove(temp.size()-1));
		}
	}
	
	private void constructResult(ArrayList<Character> left, ArrayList<Character> right, ArrayList<Character> temp, ArrayList<String> result){
		StringBuilder sb = new StringBuilder();
		for(Character c : temp){
			String s = ""+c;
			sb.append(s);
		}
		for(Character c : right){
			String s = ""+c;
			sb.append(s);
		}
		result.add(sb.toString());
	}
	
}