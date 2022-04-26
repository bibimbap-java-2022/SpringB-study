package bibimbap.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int ROW = 5;
    private static final int COL = 5;

    public static void main(String[] args) {
        System.out.println("202211305 박지원");

        int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 199, 0, -11, -150};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[][] map = new int[ROW][COL];
        setMap(map);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력해주세요[ex: 5] : ");
            int input = sc.nextInt();

            for (int i = 0; i < COL; i++) {
                for (int j = 0; j < ROW; j++) {
                    if (map[i][j] == input) {
                        map[i][j] = 0;
                    }
                }
            }

            int bingo = 0;

            // 가로 빙고
            for (int i = 0; i < COL; i ++) {
                int count = 0;
                for (int j = 0; j < ROW; j++) {
                    if (map[i][j] == 0) count++;
                }
                if (count == 5) bingo++;
            }

            // 세로 빙고
            for (int i = 0; i < ROW; i ++) {
                int count = 0;
                for (int j = 0; j < COL; j++) {
                    if (map[j][i] == 0) count++;
                }
                if (count == 5) bingo++;
            }

            // 대각선 빙고
            if (ROW == COL) {   // 가로와 세로 길이가 다를 때는 대각선 빙고가 성립하지 않음
                int countASC = 0;
                int countDESC = 0;
                for (int i = 0; i < ROW; i++) {     // 좌상단~우하단 대각선 빙고
                    if (map[i][i] == 0) countASC++;
                }

                for (int j = ROW; j >= 1; j--) {    // 우상단~좌하단 대각선 빙고
                    if (map[j - 1][ROW - j] == 0) countDESC++;
                }
                System.out.println(countDESC);
                if (countASC == 5 || countDESC == 5) bingo++;
            }

            if (bingo >= 3) {
                break;
            }
            System.out.println(Arrays.deepToString(map));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < COL; i ++) {
            for (int j = 0; j < ROW; j++) {
                result.append(map[i][j]).append(" ");
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    private static void setMap(int[][] map) {
        for (int i = 1; i <= ROW * COL; i++) {
            boolean flag = true;
            while (flag) {
                int mi = ((int) (Math.random() * 10)) % ROW;
                int mj = ((int) (Math.random() * 10)) % COL;
                if (map[mi][mj] == 0) {
                    map[mi][mj] = i;
                    flag = false;
                }
            }
        }
    }
}
