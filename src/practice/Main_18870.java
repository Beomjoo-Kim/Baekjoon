package practice;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_18870 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, cnt;
    static int[] arr;

    static void sol() {
        // arr 을 sort 후 하나하나 treeMap 으로 저장 -> key의 순서대로 저장됨.
        // 저장 시 임의의 cnt를 하나씩 올려가며 저장
        // arr을 돌며 해당하는 key값의 value로 replace
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> m = new TreeMap<>();
        for (int i : sortedArr) {
            if (!m.containsKey(i)) {
                m.put(i, cnt++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = m.get(arr[i]);
        }
    }

    static void getInput() throws IOException {
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void printResult() throws IOException {
        for (int i : arr) {
            bw.write(i+" ");
        }
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        getInput();
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        sol();
        printResult();
    }
}
