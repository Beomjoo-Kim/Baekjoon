package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main_17626_Solving {
	static int n;
	static int a;
	static ArrayList<Integer> result = new ArrayList<>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
		int i = 0;
		while(n>0) {
			a = (int)Math.sqrt(n);
			n-=Math.pow(a, 2);
			i++;
			System.out.println(a);
		}
		bw.write(i+"");
		bw.close();
		br.close();
	}

}
