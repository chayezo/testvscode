package codeupexample.problem;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Example1023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		StringTokenizer token = new StringTokenizer(num,".");
		String[] nums = new String[2];
		int i=0;
		while(token.hasMoreTokens()) {
			nums[i] = token.nextToken();
			i += 1;
		}
		System.out.println(nums[0] + "\n" + nums[1]);
		
		

	}

}
