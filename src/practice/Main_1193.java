package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1193 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int input, res, num, sum;
	//num - 몇번째 덩어리인지
	//sum - 덩어리 도착 전까지 몇개의 숫자가있는지
	
	
	public static void calNum() {
		int temp = input;
		while(true) {
			if(temp-num<=0) {
				
				return;
			}
			else temp-=num;
			sum+=num;
			num++;
		}
	}
	
	public static void sol() throws IOException{
		if(input==1) {
			bw.write("1/1");
			return;
		}
		int i = num;
		int j = 1;
//		System.out.println("i = "+i);
//		System.out.println("j = "+j);
//		System.out.println("input-sum = " + (input-sum));
		for(int k = 1; k<input-sum; k++) {
			i--;
			j++;
		}
		if(num%2==1) {
			bw.write(i+"/"+j);
		}else {
			bw.write(j+"/"+i);
		}
	}
	
	public static void main(String[] args) throws IOException{
		input = Integer.parseInt(br.readLine());
		calNum();
//		System.out.println("num = " + num);
//		System.out.println(input - sum+1);
		
		sol();
		
		bw.flush();
		br.close();
	}
}
