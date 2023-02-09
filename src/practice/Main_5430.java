package practice;

import java.io.*;
import java.util.ArrayDeque;

public class Main_5430 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;
    static String p;
    static ArrayDeque<Integer> q;
    static String[] pArr;
    static boolean isReversed;

    static void sol() throws Exception {
        // input 받고 n보다 큰 수가 들어올 경우 error.
        // D 함수에선 남아있는 수가 없는데 D가 들어올 경우 error
        for (String s : pArr) {
            switch (s) {
                case "D":
                    funcD();
                    break;
                case "R":
                    funcR();
                    break;
                default:
                    break;
            }
        }
    }

    static void funcD() throws Exception {
        // 첫번째 버리기
        if (q.size() == 0) {
            throw new Exception();
        } else {
            if(isReversed) q.removeLast();
            else q.removeFirst();
        }
    }

    static void funcR() {
        // reverse
        isReversed = !isReversed;
    }

    static boolean getInputAndValidation() throws IOException {
        // 명령 입력
        isReversed = false;
        p = br.readLine();
        p.replaceAll("RR","");
        pArr = p.split("");
        n = Integer.parseInt(br.readLine());
        // array 입력
        String input = br.readLine();
        input = input.substring(input.indexOf("[")+1, input.indexOf("]"));
        String[] strArr = input.split(",");
        if(strArr.length != n && n > 0) {
            System.out.println("error");
            return false;
        }
        q = new ArrayDeque<>();
        if (n > 0) {
            for (String s : strArr) {
                q.add(Integer.parseInt(s));
            }
        }
        strArr = null;
        return true;
    }

    static void printQueue() throws IOException {
        bw.write("[");
        while (!q.isEmpty()) {
            if (isReversed) {
                if(q.size() != 1) bw.write(q.pollLast()+",");
                else bw.write(q.pollLast()+"");
            }else {
                if(q.size() != 1) bw.write(q.pollFirst()+",");
                else bw.write(q.pollFirst()+"");
            }
        }
        bw.write("]");
        bw.newLine();
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            if(getInputAndValidation()){
                // 작업
                try {
                    sol();
                    printQueue();
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        }
    }
}
