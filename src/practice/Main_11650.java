package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// https://seeminglyjs.tistory.com/164
// 2차원 배열 sort -> sort(targetArr, new comparator~~)
// 아니면 객체로 만들어다가 풀라고 
public class Main_11650 {
	

	// 객체 생성을  통해 solve s
	// 객체 생성을  통해 solve s
	static class TestC implements Comparable<TestC>{

		int a;
		
		TestC(int t){
			this.a = t;
		}
		
		@Override
		public String toString() {
			return  a + "";
		}

		@Override
		public int compareTo(TestC o) {
			return (this.a - o.a) * -1;
		}
		
	}
	
	public static void main2() {
		TestC c1 = new TestC(2);
		TestC c2 = new TestC(1);
		TestC c3 = new TestC(6);
		TestC c4 = new TestC(4);
		
		List<TestC> l = new ArrayList<TestC>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		
		Collections.sort(l);
		System.out.println(l);
		
		TestC[] a = new TestC[4];
		a[0] = c1;
		a[1] = c2;
		a[2] = c3;
		a[3] = c4;
		
		Arrays.sort(a);
		for(TestC temp : a) {
			System.out.println(temp.toString());
		}
	}
	// 객체 생성을  통해 solve e
	// 객체 생성을  통해 solve e
	
	static int dotCnt;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] dotArr;
	static StringBuffer sb = new StringBuffer();
	
	public static void getDotArr() throws IOException {
		for(int i = 0 ; i < dotCnt ; i++) {
			String temp = br.readLine();
			StringTokenizer st = new StringTokenizer(temp);
			dotArr[i][0] = Integer.parseInt(st.nextToken());
			dotArr[i][1] = Integer.parseInt(st.nextToken());
		}
	}
	
	public static void disp() {
		for(int i = 0 ; i < dotCnt ; i++) {
			sb.append(dotArr[i][0] + " " + dotArr[i][1] + "\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void sol() {
		Arrays.sort(dotArr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return o1[1]-o2[1];
				else {
					return o1[0] - o2[0];
				}
			}
			
		});
	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		dotCnt = Integer.parseInt(br.readLine());
		dotArr = new int[dotCnt][2];
		
		getDotArr();
		sol();
		disp();
	}
	
	
	
}
