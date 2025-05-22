import java.io.*;
public class Solution{
    static char[][] board = new char[100][100];

    // 문자열 내에서 가장 긴 회문 길이 반환
    static int check(String str) {
        int len = str.length();
        for (int l = len; l >= 1; l--) {
            for (int start = 0; start <= len - l; start++) {
                int left = start;
                int right = start + l - 1;
                boolean palindrome = true;
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        palindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (palindrome) return l;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int testNum = Integer.parseInt(br.readLine());
            for (int i = 0; i < 100; i++) {
                String line = br.readLine();
                for (int j = 0; j < 100; j++) {
                    board[i][j] = line.charAt(j);
                }
            }

            int maxLen = 0;
            // 가로 검사
            for (int i = 0; i < 100; i++) {
                String rowStr = new String(board[i]);
                int res = check(rowStr);
                if (res > maxLen) maxLen = res;
            }

            // 세로 검사
            for (int j = 0; j < 100; j++) {
                StringBuilder colStr = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    colStr.append(board[i][j]);
                }
                int res = check(colStr.toString());
                if (res > maxLen) maxLen = res;
            }

            sb.append("#").append(testNum).append(" ").append(maxLen).append("\n");
        }
        System.out.print(sb);
    }
}
