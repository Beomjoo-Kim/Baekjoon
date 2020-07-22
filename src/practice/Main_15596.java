package practice;

public class Main_15596 {
	int n;
	int[] a = new int[n];
	long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i<a.length; i++) {
				sum+=a[i];
		}
		return sum;
	}
}
