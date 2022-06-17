package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1676 {
	// N! 의 결과에서 뒤에서부터 숫자를 차례대로 확인해 0 이 아닌 수가 처음 나타날 때
	// 10 -> 2
	// 3 -> 0
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static class testC{
		int cntTwo;
		int cntFive;
		
		testC(int n){
			int cntTwo = 0, cntFive = 0;
			for(int i = 2 ; i <= n; i ++) {
				while(n % i == 0) {
					if(i == 2 )cntTwo ++;
					if(i == 5 )cntFive ++;
					n /= i;
				}
			}
			this.cntTwo = cntTwo;
			this.cntFive = cntFive;
		}

		@Override
		public String toString() {
			return "testC [cntTwo=" + cntTwo + ", cntFive=" + cntFive + "]";
		}
		
	}
	
	
	
	
	// n이하의 수 중 2의배수, 5의배수 갯수를 찾아 2,5 커플링의 갯수만큼 추가?
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
//		System.out.println(new testC(n));
		System.out.println(sol(n));
		
	}
	
	// n이라는 수보다 작은 모든것에 대해 testC 객체 생성하여 각 cntTwo, cntFive를 가져와 전체 갯수를 구하고 하나씩 페어링하여 count
	static int sol(int n) {
		int totalTwo = 0 , totalFive = 0;
		int result = 0;
		for(int i = 2 ; i <= n ; i++) {
			totalTwo += new testC(i).cntTwo;
			totalFive += new testC(i).cntFive;
		}
		while(totalTwo > 0 && totalFive > 0) {
			totalTwo --;
			totalFive --;
			result ++;
		}
		return result;
	}
}
