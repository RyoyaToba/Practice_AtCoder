package ABC328.D;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        /** 他の人の回答を拝借
         * そこで、実行制限時間に間に合う方針として、スタックを使った以下の手順でシミュレーションを行うことによって、 全体で
         * O(N) 時間で本問題を解くことができます。
         * 空のスタックを準備し、
         * S の文字を先頭から順に
         * 1 文字ずつスタックの先頭にpushしていく。
         * ただしその過程で、スタックの先頭に文字列 ABC が作られる（つまり、スタックの先頭の文字（最後に push した文字）が C 、先頭から
         * 2 番目の文字が B 、先頭から
         * 3 番目の文字が A の状態になる）たびに、スタックの先頭からその
         * 3 文字 ABC を随時 pop する。
         * */

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            b.append(s.charAt(i));
            if (0 <= b.indexOf("ABC", b.length() - 3)) {
                b.setLength(b.length() - 3);
            }
        }

        System.out.println(b.toString());
    }
}
