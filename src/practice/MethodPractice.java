package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MethodPractice {

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
		double MAX = getMAX(N, score);
		
		//점수 변환
		changeScore(N, score, MAX);
		
		//평균 구하기
		double avg = getAvg(N, score);
		
		System.out.println(avg);
	}

	public static double getAvg(int N, double[] score) {
		double sum=0;
		for(int i=0; i<N; i++) {
			sum+=score[i];
		}
		double avg = sum/N;
		return avg;
	}

	public static void changeScore(int N, double[] score, double MAX) {
		for(int i=0; i<N; i++) {
			score[i]=(score[i]/MAX)*100;
		}
	}

	public static double getMAX(int N, double[] score) {
		double MAX = 0;
		for(int i=0; i<N; i++) {
			if(MAX<score[i]){
				MAX = score[i];
			}
		}
		return MAX;
	}

}