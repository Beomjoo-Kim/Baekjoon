package practice;


//https://jackpot53.tistory.com/33 읽고 다시
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
		int right = target.length-1;
		int left = 0;
		while(left<=right) {
			int mid = (left+right)/2;
			if(target[mid]>get[n]) {
				left = mid + 1;
			}else if(target[mid]<get[n]) {
				right = mid - 1;
			}else {
				ans[n]++;
				break;
			}
		}
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
		for(int i = 0; i<get.length; i++) {
			check(i);
		}
		disp();
	}
}
