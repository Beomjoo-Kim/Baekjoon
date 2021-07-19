package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_17219 {
	static int n, m;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashMap<String, String> pw = new HashMap<>();
	
	static void setPw() throws IOException {
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			String site = st.nextToken();
			String password = st.nextToken();
			pw.put(site, password);
		}
	}
	static void getPw() throws IOException {
		for(int i = 0; i<m; i++) {
			String site = br.readLine().trim();
			bw.write(pw.get(site)+"\n");
		}
	}
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		setPw();
		getPw();
		br.close();
		bw.close();
		
	}
}
