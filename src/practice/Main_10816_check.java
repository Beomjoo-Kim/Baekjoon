package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//https://jackpot53.tistory.com/33 읽고 다시

public class Main_10816_check {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer> input = new ArrayList<Integer>();
	static ArrayList<Integer> target = new ArrayList<Integer>();;
	static int n,m,mid;
	static int[] result;
	
	public static void getInputCards() throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< n; i++) {
			int temp = Integer.parseInt(st.nextToken());
//			input.add(Integer.parseInt(st.nextToken()));
			input.add(temp);
		}
	}
	public static void getTargetCards() throws NumberFormatException, IOException {
		m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< m; i++) {
			target.add(Integer.parseInt(st.nextToken()));
		}
	}
	
	public static void sol() {
		result = new int[m];
		for(int i = 0; i<m; i++) {
			result[i] = getUpper(target.get(i)) - getLower(target.get(i));
			System.out.print(result[i]+" ");
		}
		
	}
	
	public static int getLower(int target) {
		int low = 0;
		int high = input.size();
		while(low<high) {
			mid = low + (high-low)/2;
			if(target<=input.get(mid)) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static int getUpper(int target) {
		int low = 0;
		int high = input.size();
		while(low<high) {
			mid = low + (high-low)/2;
			if(target>=input.get(mid)) {
				low = mid + 1;
			}else {
				high = mid;
			}
		}
		return high;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInputCards();
		getTargetCards();
		Collections.sort(input);
		sol();
	}
}
