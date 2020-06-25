package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1181_check {
	static int n, cnt, strLength;
	static String temp;

	public static void sameDelete(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[i] = "";
					cnt++;
				}
			}
		}
	}

	public static void checkNum(String[] arr) {
		// 글자수대로
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() > arr[j].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

//		 사전순서

	}

	public static void checkDic(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<i;j++) {
				if(arr[i].length()==arr[j].length()&&arr[i].compareTo(arr[j])<0) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

	}

	public static void printAns(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static String[] deleteEmpty(String[] input) {

		for (int i = 0; i < input.length; i++) {
			if (input[i].isEmpty()) {
					for (int j = i+1; j < input.length; j++) {
						if(!(input[j].isEmpty())) {
							temp = input[i];
							input[i]=input[j];
							input[j]=temp;
						}
					}
				
			}			
		}
		String[] output = new String[n-cnt];
		for(int i=0; i<output.length;i++) {
			output[i]=input[i];
		}
		return output;


	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		sameDelete(arr);
		String[] result = deleteEmpty(arr);
		checkNum(result);
		checkDic(result);
//		
		printAns(result);

	}

}







//이근성코드  한번에 모든 정렬됨
//for (int i = 0; i < arr.length; i++) {
//    for (int j = 0; j < i; j++) {
//       if((arr[i].length()-arr[j].length()==0 &&
//             arr[i].compareTo(arr[j]) < 0) || 
//             arr[i].length() < arr[j].length()) {
//          String tmp = arr[i];
//          arr[i] = arr[j];
//          arr[j] = tmp;
//       }
//    }
// }
