package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11723 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int m;
	static int[] a = new int[21];
	
	static boolean search(int n) {
		if(a[n-1]==1)return true;
		else return false;
	}
	static void add(int n) {
		if(search(n)) {
			return;
		}else {
			a[n-1]=1;
		}
	}
	static void remove(int n) {
		if(search(n)) {
			a[n-1]=0;
		}else {
			return;
		}
	}
	static void check(int n) throws IOException {
		if(search(n)) {
			bw.write(1+"\n");
		}
		else bw.write(0+"\n");
	}
	static void toggle(int n) {
		if(search(n)) {
			a[n-1]=0;
		}else {
			a[n-1]=1;
		}
	}
	static void all() {
		for(int i = 0; i<a.length; i++) {
			a[i]=1;
		}
	}
	static void empty() {
		for(int i = 0; i<a.length; i++) {
			a[i]=0;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		m = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int x = 0;
			if(st.hasMoreElements()) {
				x = Integer.parseInt(st.nextToken());
			}
			switch(order) {
			case "add":
				add(x);
				break;
			case "remove":
				remove(x);
				break;
			case "check":
				check(x);
				break;
			case "toggle":
				toggle(x);
				break;
			case "all":
				all();
				break;
			case "empty":
				empty();
				break;
			}
		}
		br.close();
		bw.close();
	}
}
