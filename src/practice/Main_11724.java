package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_11724 {
    static ArrayList<Integer>[] arr;
    static int[] chk;
    static int cnt;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;

    static void sol() {
        // chk를 for로 확인해서 0(미방문)인 경우 find시행. (+ cnt증가)
        // find에선 해당 index에 들어가있는 arrayList를 for로 확인하며 각 index마다 chk를 1로 변경.

        for (int i = 1; i <= n; i++) {
            if (chk[i] == 0) {
                cnt++;
                find(i);
            }
        }
    }

    static void find(int index) {
        if (arr[index] == null) return;

        for (int i = 0; i < arr[index].size(); i++) {
            if (chk[arr[index].get(i)] == 0) {
                // 미방문
                chk[arr[index].get(i)] = 1;
                find(arr[index].get(i));

            }
        }
    }

    static void getInput() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>[n + 1];
        chk = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(arr[a] == null) arr[a] = new ArrayList<>();
            arr[a].add(b);
            if(arr[b] == null) arr[b] = new ArrayList<>();
            arr[b].add(a);
        }

    }

    public static void main(String[] args) throws IOException {
        getInput();
        sol();
        System.out.println(cnt);

//        for (ArrayList<Integer> a : arr) {
//            System.out.print(a + "  ");
//        }
    }
}
