package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main_1764 {
	static int n,m;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		HashSet<String> a = new HashSet<String>();
		HashSet<String> b = new HashSet<String>();
		for(int i = 0; i< n+m; i++) {
			String temp = br.readLine().trim();
			if(a.contains(temp)) {
				b.add(temp);
			}else {
				a.add(temp);
			}
		}
		ArrayList<String> res1 = new ArrayList<String>(b);
		Collections.sort(res1);
		bw.write(res1.size()+"\n");
		Iterator<String> res2 = res1.iterator();
		while(res2.hasNext()) {
			bw.write(res2.next()+"\n");
		}
		br.close();
		bw.close();
	}
}
