package codeupexample.problem;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Example1019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String date = scan.nextLine();
		StringTokenizer token = new StringTokenizer(date,".");
		// "."로 구분해서 문자열을 잘라준다.
		
		int[] arr = new int[3];
		// 길이 3의 int 보관 배열 선언.
		int i=0;
		while(token.hasMoreTokens()) {
		// 입력한 문자열을 int 배열에 넣기 위해 int로 형변환해줌.
			arr[i] = Integer.parseInt(token.nextToken());
				i += 1;
		}
		
		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);
		
		System.out.print(year + "." + month + "." + day);
		

	}

}
