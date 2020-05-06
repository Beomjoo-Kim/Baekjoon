package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		String mul = Integer.toString(A*B*C);
		String[] result = mul.split("");
		int[] count = new int[10];
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<10; j++) {				//이부분은 result.length로 하면 안된다.
				if(Integer.parseInt(result[i])==j) {
					count[j]++;
				}
			}
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
