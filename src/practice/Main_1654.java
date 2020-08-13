package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1654 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int k,n;
	static long[] inputLan;
	static long result, maxValue;
	
	
	public static void getData() throws IOException {
		//기본 조건들 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		inputLan = new long[k];
		for(int i = 0; i< k; i++) {
			inputLan[i] = Long.parseLong(br.readLine());
			maxValue = Math.max(maxValue, inputLan[i]);
		}
		br.close();
	}
	public static void binarySol() throws IOException {
		if(n==1) {
			//1개의 전선만 원할 경우 가장 큰 전선의 길이를 출력
			bw.write(inputLan[0]+"");
			bw.close();
			return;
		}
//		Arrays.sort(inputLan);
		//어레이 소트를 하느니 처음 값을 받을 때 max 값을 받아 그것을 upper에 집어 넣는다.
		
//		long upper = inputLan[k-1];
		long upper = maxValue;
		long lower = 1;
		
		
		while(lower<=upper) {
			int temp = 0;
			//전선의 갯수를 세는 변수 temp
			long mid = (lower + upper)/2;
			if(mid<=0)break;
			//0으로 나누는 경우를 방지
			for(int i = 0; i< inputLan.length; i++) {
				temp +=inputLan[i]/mid;
			}
			if(temp >= n) {
				result = Math.max(mid, result);
				lower=mid+1;
				//최대의 수를 구하기 때문에 탐색은 계속 되어야 하고,
				//lower를 증가시키는 방향으로 설정
			}else if(temp < n) {
				upper = mid-1;
			}
//			else if(temp > n) {
//				result = Math.max(mid, result);
//				lower = mid+1;
//			}
		}
		bw.write(result+"");
		bw.close();
	}
	
	
	public static void main(String[] args)throws IOException {
		getData();
//		sol();
		binarySol();
	}
	
}

//이분 탐색 시, while(lower<=upper)로 조건을 설정하고,
//mid<=target일 시 lower = mid+1,
//그 외엔 upper = mid-1로 설정한다.


//public static void sol() {
//	Arrays.sort(inputLan);
//	int res = inputLan[k-1];
//	while(true) {
//		int temp = 0;
//		for(int i = 0; i<inputLan.length; i++) {
//			temp += inputLan[i]/res;
//		}
//		
//		
//		if(temp==n) {
//			System.out.println(res);
//			return;
//		}
//		res--;
//		if(res==0)break;
//	}
//}