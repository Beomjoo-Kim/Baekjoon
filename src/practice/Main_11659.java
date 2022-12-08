package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int M, N, s, e;
    static int[] inputArr = new int[100001];
    static int[] range = new int[2];
    static int[] preSum = new int[100001];


    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
            if (i == 1) {
                preSum[i] = inputArr[i];
            }else preSum[i] = inputArr[i] + preSum[i-1];
        }
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken())-1;
            e = Integer.parseInt(st.nextToken());
            if(s==0){
                System.out.println(preSum[e]);
            }else System.out.println(preSum[e]-preSum[s]);
        }
    }
}
