package practice;

public class Main_11650_second {
	
	public void mergeSort(int[] a, int m, int n) {
		while(m<n) {
			int middle = (m+n)/2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	}
	
	public void merge(int[] a, int m, int middle, int n) {
		int i = m, j = middle+1, k =m;
		
		while(i<=middle && j<=k) {
			
		}
	}
	
	public static void main(String[] args) {
		
		
	}

}
