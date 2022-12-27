package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M, V;
    // 정점의 갯수, 간선의 갯수, 탐색을 시작할 정점의 번호
    static int[][] arr;
    static boolean[] check;
    static Queue<Integer> resultDfs = new LinkedList<>();
    static Queue<Integer> resultBfs = new LinkedList<>();
    static Queue<Integer> q = new LinkedList<>();

    static void getDfs(int start) {
        if(check[start]) return;
        check[start] = true;
        resultDfs.add(start+1);
        for (int i = 0; i < N; i++) {
            if (arr[start][i] == 1) {
                getDfs(i);
            }
        }
    }

    static void getBfs(int start) {
        if(check[start]) return;
        check[start] = true;
        resultBfs.add(start + 1);
        for (int i = 0; i < N; i++) {
            if (arr[start][i] == 1) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            getBfs(q.poll());
        }
    }

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        check = new boolean[N];
        arr = new int[N][N];
        int x,y;
        for (int i = 0; i < M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x-1][y-1] = 1;
            arr[y-1][x-1] = 1;
        }

        // 그래프 출력
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        getDfs(V-1);
        while (!resultDfs.isEmpty()) {
            System.out.print(resultDfs.poll() + " ");
        }
        check = new boolean[N];
        getBfs(V-1);
        System.out.println();
        while (!resultBfs.isEmpty()) {
            System.out.print(resultBfs.poll() + " ");
        }

    }
}
