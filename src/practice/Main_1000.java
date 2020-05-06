package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1000 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //BufferedReader 사용
		String input = br.readLine(); //다음 Line 입력
		StringTokenizer st = new StringTokenizer(input); // StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있습니다.
		int A = Integer.parseInt(st.nextToken()); //첫번째 분할
		int B = Integer.parseInt(st.nextToken()); //두번째 분할
		System.out.println(A+B);
		
	}

}
