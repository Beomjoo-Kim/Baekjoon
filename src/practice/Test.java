package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
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
	
	public static void main(String[] args) {
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
}
