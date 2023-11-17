package TOYOTA20231111.C;

import java.util.Scanner;

public class Main2 {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            // y: 文字数　x: テスト回数
            int y = in.nextInt(), x = in.nextInt();
            // s: 文字列
            String s = in.next();

            // 文字数より１文字分長い配列
            int a[] = new int[y+1];

            int k = 0;

            for (int i = 1; i < y; i++) {

                // n番目の文字を抜き出す – charAtメソッド
                // その時点の文字までの連続した回数を配列aに格納している。
                if(s.charAt(i) == s.charAt(i-1)){
                    a[i] = a[i-1] + 1;

                } else {
                    a[i] = a[i-1];
                }
            }

            for (int i = 0; i < x; i++){

                int c = in.nextInt(), b = in.nextInt();
                System.out.println(a[b-1] - a[c-1]);

            }
        }
}