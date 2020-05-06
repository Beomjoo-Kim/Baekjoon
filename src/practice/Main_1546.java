package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		double[] score = new double[N];
		//점수 배열에 넣기
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		//최댓값 구하기
		double MAX = 0;
		for(int i=0; i<N; i++) {
			if(MAX<score[i]){
				MAX = score[i];
			}
		}
		
		//점수 변환
		for(int i=0; i<N; i++) {
			score[i]=(score[i]/MAX)*100;
		}
		
		//평균 구하기
		double sum=0;
		for(int i=0; i<N; i++) {
			sum+=score[i];
		}
		double avg = sum/N;
		
		System.out.println(avg);
	}

}
