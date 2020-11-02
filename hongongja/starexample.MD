



```java
//코드업예제 1287 : 구구단을 *로 출력하기
import java.util.*;
public class Sample03 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.close();

		for(int i = 1; i<=9; i++) {
			for (int j =1; j<=i*t; j++) {
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
```