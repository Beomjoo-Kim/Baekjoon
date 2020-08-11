package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11866 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	static Queue<Integer> inputQueue = new LinkedList<Integer>();
	static int n,k;
	static int[] res;
	
	
	public static void alInit() {
		for(int i = 1; i<= n; i++ ) {
			inputQueue.add(i);
		}
	}
	
	public static void sol(){
		res = new int[n];
		int temp = 0;
		for(int i = 0; i<n; i++) {
			
			for(int j = 1; j<k; j++) {
				temp = inputQueue.remove();
				inputQueue.add(temp);
			}
			res[i] = inputQueue.remove();
			if(inputQueue.isEmpty())break;
		}
	}
	
	public static void printres() throws IOException {
		bw.write("<");
		for(int i = 0; i<n; i++) {
			if(i==n-1) {
				bw.write(res[i]+"");
				bw.write(">");
				return;
			}
			bw.write(res[i]+", ");
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		alInit();
		sol();
		printres();
		br.close();
		bw.close();
	}
}
