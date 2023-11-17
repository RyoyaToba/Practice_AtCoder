package TOYOTA20231111.D;

import java.util.Scanner;

public class Main {

    /** replaceメソッドを使っていると時間切れになる。以下解説。
     * 問題文中の操作をシミュレーションすれば答えを得ることは出来ますが、愚直な実装では最悪時間計算量が
     * Θ(N^2) となり実行制限時間超過（TLE）を招きうるため、実装方針には注意と工夫が必要です。
     * 例えば、文字列Sを保持するデータ構造によっては、
     * S からある文字を削除した際、削除で生じた隙間を詰めるために削除箇所より後ろの部分を先頭にずらす処理が生じます。
     * この処理は最悪の場合（S の先頭の文字を削除する場合）にΘ(N) 時間かかるため、これを繰り返すと、
     * 入力で与えられる文字列によってはシミュレーション全体でΘ(N^2) 時間かかってしまいます。
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 入力文字
        String S = sc.next();

        while (S.contains("ABC")) {
            S = S.replace("ABC", "");
        }

        System.out.println(S);
    }
}
