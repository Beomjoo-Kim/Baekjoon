package practice;


//https://jackpot53.tistory.com/33 읽고 다시
// print 대신에 sb로 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10816_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, M;
	static int[] get, target, ans;
	
	public static void takeCard() throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0; i<N; i++) {
			get[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	public static void takeTarget() throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0; i<M; i++) {
			target[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	public static void check(int n) {
		// upperBound - lowerBound = answer
		int upperBound = get.length-1;
		int lowerBound = 0;
		int value = target[n];
//		System.out.println("value = " + value);
		
		lowerBound = getLowerBound(value);
		upperBound = getUpperBound(value);
		
//		System.out.println("upper = " + upperBound);
//		System.out.println("lower = " + lowerBound);
//		System.out.println(upperBound - lowerBound);
		ans[n] = upperBound - lowerBound;
	}
	
	public static int getLowerBound(int value) {
		int high = get.length-1;
		int low = 0;
		
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(value <= get[mid]) {
				high = mid;
			}else{
				low = mid + 1;
			}
		}
		return low;
	}
	
	public static int getUpperBound(int value) {
		int high = get.length;
		int low = 0;
		
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(value >= get[mid]) {
				low = mid + 1;
			}else{
				high = mid;
			}
		}
		return low;
	}
	
	
	public static void disp() {
		for(int i = 0; i<ans.length; i++) {
			System.out.printf("%d ",ans[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		get = new int[N];
		takeCard();
		
		M = Integer.parseInt(br.readLine());
		target = new int[M];
		takeTarget();
		
		ans = new int[M];
		Arrays.sort(get);
		
//		for(int i : get) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		for(int i = 0; i<target.length; i++) {
			check(i);
		}
		disp();
	}
}
