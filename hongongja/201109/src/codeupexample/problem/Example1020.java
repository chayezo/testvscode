package codeupexample.problem;
import java.util.*;

public class Example1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		StringTokenizer token = new StringTokenizer(num, "-");
		
		String result = "";
		while(token.hasMoreTokens()) {
		// result에 잘라둔 문자열 붙이기.
			result += token.nextToken();
		}
		System.out.println(result);

	}

}
