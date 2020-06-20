package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int[] array = new int[3];
			for (int i = 0; i < 3; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			if (array[0] == 0 && array[1] == 0 && array[2] == 0)
				break;
			int first, second, third, temp = 0;
			
			//순차적으로 배열
			if (array[0] > array[1]) {
				temp = array[0];
				array[0] = array[1];
				array[1] = temp;
			}
			if (array[1] > array[2]) {
				temp = array[1];
				array[1] = array[2];
				array[2] = temp;
			}
			if (array[0] > array[1]) {
				temp = array[0];
				array[0] = array[1];
				array[1] = temp;
			}

			if ((array[2] * array[2]) == (array[0] * array[0]) + (array[1] * array[1])) {
				System.out.println("right");
			} else
				System.out.println("wrong");

		}

	}
}
