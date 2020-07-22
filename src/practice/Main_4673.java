package practice;

public class Main_4673 {
	static boolean checkSelfNum(int n) {
		for(int i = 0; i<n; i++) {
			if(getSum(i)+i == n)return false;
		}
		return true;
	}
	
	
	static int getSum(int n) {
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		for(int i = 1; i<=10000; i++) {
			if(checkSelfNum(i))System.out.println(i);
		}
	}
}
