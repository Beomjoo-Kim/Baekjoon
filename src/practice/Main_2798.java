package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2798 {
	static int N,M,ans;
	static int[] cards;
	static int[] sel = new int[3];
	static int a;
	static int b = 0;
	
	public static void dfs(int cnt, int idx, int max) {
		if(max > M) return;
		if(cnt == 3) {
			ans  = Math.max(ans, max);
			return;
		}
		for (int i = idx; i < N; i++) {
			dfs(cnt+1,i+1, max + cards[i]);
		}
	}
	// 10 500
	// 93 181 245 214 315 36 185 138 216 295
	// 일 때 왜 500이 나오는지?  -> dfs안의 i+1을 idx+1로 하면 틀림
	
	static boolean[] v;
	public static void dfs2(int cnt) {
		if(cnt == 3) {
			calc();
			return;
		}
		for (int i = 0; i < N; i++) {
			if(v[i]) continue;
			v[i] = true;
			dfs2(cnt+1);
			v[i] = false;
		}
	}
	
	private static void calc() {
		
		a=0;
		for(int i = 0; i<N; i++) {
			if(v[i]) a += cards[i];
		}
		if(a<=M){
			b = (a>b)?a:b;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cards = new int[N];
		v = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		dfs2(0);
		System.out.println(b);
	}

}
