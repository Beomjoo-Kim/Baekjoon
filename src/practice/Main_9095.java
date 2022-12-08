package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9095 {
    static int n;
    static int cnt = 0;

    public static void sol(int p) {
        for(int i = 1 ; i < 4 ; i++) {
            if(p==0) {
                cnt++;
                return;
            }else if(p<0) {
                p+=i;
                return;
            }
            sol(p-i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int T = Integer.parseInt(s);
        for(int i = 0 ; i < T ; i++) {
            n = Integer.parseInt(br.readLine());
            sol(n);
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
