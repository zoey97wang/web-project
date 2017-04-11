import java.util.Scanner;
import java.util.Stack;

public class DelimiterMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a String with Delimiter");
		String input = scan.nextLine();
		char[] in = input.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<in.length;i++){
			char c = in[i];
			if(c=='{'||c=='('||c=='[')
				stack.push(in[i]);
			else{
				if(!stack.isEmpty()&&stack.peek()==getLeft(c))
					stack.pop();
			}
		}
		if(stack.isEmpty())
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
	public static char getLeft(char c){
		char result = ' ';
		switch(c){
		case '}':
			return '{';
		case ')':
			return '(';
		case ']':
			return '[';
		}
		return result;
	}

}
