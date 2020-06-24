package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1920{
	static int N, M;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
// 처음 숫자 입력
		int[] inputArray = new int[N];
		for (int i = 0; i < N; i++) {
			inputArray[i] = sc.nextInt();
		}
// 배열 입력

		M = sc.nextInt();
// 두번째 숫자 입력
		int[] numArray = new int[M];
		for (int i = 0; i < M; i++) {
			numArray[i] = sc.nextInt();
		}
// 두번째 배열 입력
		Arrays.sort(inputArray);
// 대상배열 정렬

		int[] resultArray = new int[M];
// 정답입력배열 선언

		for (int i = 0; i < M; i++) {

			int left = 0;
			int right = N - 1;
			while (left <= right) {
				int mid = (left + right) / 2;

				if (inputArray[mid] == numArray[i]) {
					resultArray[i] = 1;
					break;
				} else if (inputArray[mid] < numArray[i]) {
					left = mid + 1;
				} else if (inputArray[mid] > numArray[i]) {
					right = mid - 1;
				}

			}

		}

		for (int i = 0; i < M; i++) {
			System.out.println(resultArray[i]);
		}

		sc.close();
	}

}
