package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1065 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] n;
	static int cnt,count;

	public static int[] sep(int num) {
		count=0;
		int temp = num;
		while(temp>0) {
			count++;
			temp/=10;
		}
		//자릿수 만큼 배열 생성하기 위한 count
		
		n = new int[count];
		int i =0;
		while(num>0) {
			n[i++] = num%10;
			num/=10;
		} //일의자리, 십의자리, 백의자리 순으로 배열에 삽입
		
		return n;
	}
	
	public static boolean checkHan() {
		boolean result = true;
		if(n.length<3)return result;
		else {
			int a = n[0]-n[1]; //등차 a
			for(int i = 1; i<n.length-1; i++) {
				if((n[i]-n[i+1])!=a) { //등차가 같지 않을경우 false
					result = false;
					break;
				}
				else result = true;
			}
			return result;
		}
	}
	
	public static void main(String[] args) throws IOException{
		int input = Integer.parseInt(br.readLine());
		for(int i = 1; i<=input; i++) {
			sep(i);
			if(checkHan())cnt++;
		}
		bw.write(cnt+"\n");
		bw.flush();
		br.close();
	}

}
