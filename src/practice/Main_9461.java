package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9461 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T;
    static long[] arr = new long[100];

    static long sol(int n){
        if(arr[n] == 0) arr[n] = sol(n-3) + sol(n-2);
        return arr[n];
    }

    static void init(){
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
    }

    public static void main(String[] args) throws IOException {
        init();
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            n--;
            System.out.println(sol(n));
        }
    }
}
