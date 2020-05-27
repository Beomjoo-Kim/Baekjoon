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
	
	public static void dfs(int cnt, int idx, int max) {
		if(max > 21) return;
		if(cnt == 3) {
			ans  = Math.max(ans, max);
			return;
		}
		for (int i = idx; i < N; i++) {
			dfs(cnt+1,idx+1, max + cards[i]);
		}
	}
	
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
		// TODO Auto-generated method stub
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
		dfs(0,0,0);
//		blackjack();
		System.out.println(ans);
	}

}
