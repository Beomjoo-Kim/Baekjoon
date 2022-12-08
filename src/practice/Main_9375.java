package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_9375 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t;
    static int result = 0;
    static Map<String, Integer> clothes = new HashMap<>();

    public static void getInput() throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String category = st.nextToken();
            if(clothes.containsKey(category)) {
                clothes.put(category, clothes.get(category)+1);
            }else {
                clothes.put(category, 1);
            }
        }
    }

    public static void sol() {
        for(String s : clothes.keySet()) {
            if(result == 0) result = clothes.get(s) + 1;
            else result *= clothes.get(s)+1;
        }
        if(result == 0) System.out.println(result);
        else System.out.println(--result);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        t = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < t ; i ++) {
            getInput();
            sol();
            clothes.clear();
            result = 0;
        }
    }
}
