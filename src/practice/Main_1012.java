package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
2
10 8 17
0 0
1 0
1 1
4 2
4 3
4 5
2 4
3 4
7 4
8 4
9 4
7 5
8 5
9 5
7 6
8 6
9 6
10 10 1
5 5
* */
public class Main_1012 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int T, X, Y, K, cnt;
	static int[][] field;


    static void sol(){
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                try {
                    if(field[i][j] == 1){
                        check(i, j);
                        cnt++;
                    }

                } catch (Exception e) {
                    System.out.println("x = " + i + ", y = " + j);
                    e.printStackTrace();
                }
            }
        }
    }

    static void check(int x , int y) {
        if (y>0 && field[x][y-1] == 1){
            field[x][y-1] = 0;
            check(x, y-1);
        }
        if (y+1<Y && field[x][y+1] == 1){
            field[x][y+1] = 0;
            check(x, y+1);
        }
        if (x>0 && field[x-1][y] == 1){
            field[x-1][y] = 0;
            check(x-1, y);
        }
        if (x+1<X && field[x+1][y] == 1){
            field[x+1][y] = 0;
            check(x+1, y);
        }

    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());



        for (int t = 0; t < T; t++) {
            String temp = br.readLine();
            StringTokenizer st = new StringTokenizer(temp);
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            field = new int[X][Y];
            cnt = 0;

            for (int i = 0; i < K; i++) {
                temp = br.readLine();
                st = new StringTokenizer(temp);
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            sol();
            System.out.println(cnt);
        }
	}
}
