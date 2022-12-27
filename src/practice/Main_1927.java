package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main_1927 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static PriorityQueue<Long> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        long input;
        for (int i = 0; i < N; i++) {
            input = Long.parseLong(br.readLine());
            if (input == 0L) {
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            } else {
                pq.add(input);
            }
        }

    }
}
