package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_3053 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int input;
	
	
	public static void getInput() {
		try {
			input = Integer.parseInt(br.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void sol1() {
		double res = 0;
		res = Math.pow((double)input, 2)*Math.PI;
		System.out.printf("%.6f\n",res);
	}
	
	public static void sol2() {
		double res = 0;
		res = Math.pow(2.0*input, 2)/2;
		System.out.printf("%.6f",res);
	}
	
	public static void main(String[] args) {
		getInput();
		sol1();
		sol2();
		
	}
}
