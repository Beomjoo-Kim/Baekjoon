package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2630 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, cntW, cntB;
    static int[][] paper;

    static void sol(int x, int y, int size){

        if (!isAreaChecked(x, y, size)) {
            int newSize = size / 2;
            sol(x, y + newSize, newSize);
            sol(x + newSize, y, newSize);
            sol(x, y, newSize);
            sol(x + newSize, y + newSize, newSize);
        }

    }

    static boolean isAreaChecked(int x, int y, int size) {
        // forfor 돌면서 checkVal과 다른값? return false;
        // 다른값이 없다? checkVal의 값에 따라 cntW, cntB ++
        int chk = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != chk) return false;
            }
        }
        if(chk == 0) cntW++;
        else if(chk == 1) cntB++;
        return true;
    }


    public static void main(String[] args) throws IOException {
        getInput();
        sol(0, 0, paper.length);
        System.out.println(cntW);
        System.out.println(cntB);
//        printPaper();
    }

    static void getInput() throws IOException {
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(input[j]);
            }
        }
    }

    static void printPaper(){
        for (int[] arr : paper) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
