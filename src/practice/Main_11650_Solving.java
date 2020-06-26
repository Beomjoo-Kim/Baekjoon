package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11650_Solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static String temp;
	
	//좌표 입력받아 String배열로
	public static String[] getLocation() throws IOException {
		String[] input = new String[n];
		for(int i = 0;i<input.length;i++) {
			input[i] = br.readLine();
		}
		return input;
	}
	
	
	// x축 증가하는 순서대로
	public static void sortByX(String[] a) {
	
		for(int i = 0; i<a.length-1; i++) {
			for(int j = 0; j<a.length-1; j++) {
				if(a[j].charAt(0) > a[j+1].charAt(0)){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}else if(a[j].charAt(0) == a[j+1].charAt(0)) {
					sortByY(a);
				}
			}
		}
		
	}
	
	//y축 증가하는 순서대로
	public static void sortByY(String[] a) {
			
			for(int i = 0; i<a.length-1; i++) {
				for(int j = 0; j<a.length-1; j++) {
					if(a[j].charAt(2) > a[j+1].charAt(2)){
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			
		}
	
	//출력
	public static void printArr(String[] a) {
		for(String s:a) {
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		n = Integer.parseInt(br.readLine());
		String[] arr = getLocation();
		sortByX(arr);
		printArr(arr);
	}

}


