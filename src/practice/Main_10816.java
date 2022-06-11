package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//https://jackpot53.tistory.com/33 읽고 다시

public class Main_10816 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int numCardCnt = 0;
	static Map<Integer, Integer> numCardMap = new HashMap<>();
	static int targetCnt = 0;
	static StringBuffer sb = new StringBuffer();
	
	public static void getNumCard() throws IOException {
		// 전체 String을 입력받아 하나씩 hash맵에서 key로 있는지 확인 후 있을 경우 value++. 없을 경우 put 1.
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0 ; i < numCardCnt ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			numCardMap.put(temp, numCardMap.getOrDefault(temp, 0) + 1);
			
//			if(numCardMap.containsKey(temp)) numCardMap.put(temp, numCardMap.get(temp)+1);
//			else numCardMap.put(temp, 1);
		}
	}
	
	public static void sol() throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int target;
		
		for (int i = 0 ; i < targetCnt ; i++) {
			target = Integer.parseInt(st.nextToken());
//			System.out.print(numCardMap.getOrDefault(target, 0) + " ");
			sb.append(numCardMap.getOrDefault(target, 0) + " ");
			
//			if(numCardMap.containsKey(target)) System.out.print(numCardMap.get(target)+ " ");
//			else System.out.print("0 ");
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		numCardCnt = Integer.parseInt(br.readLine());
		getNumCard();
		
		targetCnt = Integer.parseInt(br.readLine());
		
		sol();
		System.out.println(sb);
	}
}
