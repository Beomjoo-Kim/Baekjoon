package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main_11279 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            }
            return 0;
        });

        int n = Integer.parseInt(br.readLine());
        int input;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            }else {
                pq.offer(input);
            }
        }

    }
}
