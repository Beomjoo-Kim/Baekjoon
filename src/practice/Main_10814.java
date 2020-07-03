package practice;

import java.util.Scanner;

class Person{
	int age = 0;
	String name = "";
	int cnt = 0;;
}

public class Main_10814 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static Person[] sorted;

	public static void disp(Person[] p) {
		for(int i = 0; i<p.length; i++) {
				System.out.printf("%d %s\n",p[i].age,p[i].name);
		}
	}
	
	public static void mergeSort(Person[] p, int m, int n) {
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(p, m, middle);
			mergeSort(p, middle+1, n);
			merge(p, m, middle, n);
		}		
	}
	
	public static void merge(Person[] p, int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		while(i<=middle && j <= n) {
			if(p[i].age<p[j].age) {
				sorted[k] = p[i];
				i++;
			}else if(p[i].age>p[j].age){
				sorted[k] = p[j];
				j++;
			}else if(p[i].age==p[j].age) {
				if(p[i].cnt<p[j].cnt) {
					sorted[k] = p[i];
					i++;
				}else {
					sorted[k] = p[j];
					j++;
				}
			}
			k++;
		}
		if(i>middle) {
			for(int x = j; x<=n; x++) {
				sorted[k] = p[x];
				k++;
			}
		}else {
			for(int x = i; x<=middle; x++) {
				sorted[k] = p[x];
				k++;
			}
		}
		
		for(int x = m; x<=n; x++) {
			p[x] = sorted[x];
		}
		
	}
	
	public static void main(String[] args)  {
		N = sc.nextInt();
		sorted = new Person[N];
		Person[] p  = new Person[N];
		for(int i = 0; i<p.length; i++) {
			p[i] = new Person();
			p[i].age = sc.nextInt();
			p[i].name = sc.next();
			p[i].cnt = i;
		}
		mergeSort(p, 0, N-1);
		disp(p);
	}
}

