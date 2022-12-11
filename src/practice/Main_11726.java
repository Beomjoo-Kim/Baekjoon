package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11726 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int divide = 10007;
    static long[] nArr = new long[1001];
    // 2x1 = 1
    // 2x2 = 2
    // 2x3 = 3
    // 2x4 = 5
    // 2x5 = 8

    static void sol(int i){
        nArr[i] = (nArr[i-1] + nArr[i-2])%divide;
    }

    static void init(){
        nArr[1] = 1;
        nArr[2] = 2;
    }

    public static void main(String[] args) throws IOException {
        init();
        n = Integer.parseInt(br.readLine());
        for (int i = 3; i <= n; i++) {
            sol(i);
        }
        System.out.println(nArr[n]);

    }
}
