package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main_1541 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int res1 = 0;
    static int res2 = 0;
    static int index;
    static List<String> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                list.add(sb.toString());
                list.add(String.valueOf(input.charAt(i)));
                sb = new StringBuilder();
            } else {
                sb.append(input.charAt(i));
            }
        }
        list.add(sb.toString());
        index = list.size();
        for (int i = 0; i < list.size(); i++) {
            if ("-".equals(list.get(i))) {
                index = i;
                break;
            }
            if(!"+".equals(list.get(i))) res1 += Integer.parseInt(list.get(i));
        }
        for (int i = index+1; i < list.size(); i++) {
            if ("-".equals(list.get(i))) {
                res1 = res1 - res2;
                res2 = 0;
            } else {
                if (!"+".equals(list.get(i))) {
                    res2 += Integer.parseInt(list.get(i));
                }
            }
        }
        System.out.println(res1 - res2);
    }
}
