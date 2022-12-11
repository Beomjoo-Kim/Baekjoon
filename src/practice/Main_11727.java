package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11727 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int d = 10007;
    static int[] arr = new int[1001];

    // 2x1 = 1
    // 2x2 = 3
    // 2x3 = 5
    // 2x4 = 11
    // 2x5 =
    // 2x6 =
    // 2x7 =
    // 2x8 = 171
    // 2x9 =
    // 2x10 =
    // 2x11 =
    // 2x12 = 2731


    static void sol(int i) {
        arr[i] = (arr[i-1] + arr[i-2]*2) % d;
    }

    static void init(){
        arr[1] = 1;
        arr[2] = 3;
    }

    public static void main(String[] args) throws IOException {
        init();
        n = Integer.parseInt(br.readLine());
        for (int i = 3; i <= n; i++) {
            sol(i);
        }
        System.out.println(arr[n]);
    }
}
