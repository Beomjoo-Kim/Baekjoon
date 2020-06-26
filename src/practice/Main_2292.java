package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2292 {
	static int n ,cnt;
	
	//거리당 최댓값을 가진 배열
	public static int[] checkMax() {
		int[] max = new int[1000000];
		max[0]=1;
		for(int i =1; i<max.length; i++) {
			max[i] = max[i-1]+6*(i-1);
		}
		return max;
	}
	
	//최댓값 배열과 입력 수 비교
	public static int checkCnt(int n,int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			if(n<=arr[i]) {
				cnt=i;
				break;
			}
		}
		
		
		return cnt;
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		int[] maxArr = checkMax();
		System.out.println(checkCnt(n, maxArr));
		
	}

}
