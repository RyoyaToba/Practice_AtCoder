package ABC329.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**Run-Length-Encoding（ランレングス圧縮）
     * 連続する部分の最大を取得して、その合計値を算出する。
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字の長さ
        int N = sc.nextInt();
        // 文字列
        String S = sc.next();

        List<String> checkList = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {

            char before = 0;

            if (i != 1) {
                before = S.charAt(i -2);
            }
            
            char now = S.charAt(i -1);

            if (before != now) {
                sb.setLength(0);
            }

            sb.append(S.charAt(i -1));

            checkList.add(sb.toString());
        }

        System.out.println(checkList.stream().distinct().count());
    }
}
