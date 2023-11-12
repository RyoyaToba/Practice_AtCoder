package TOYOTA20231111.A;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // 問題数
            int a = sc.nextInt();
            //　いくつ以下か
            int b = sc.nextInt();
            //　問題の配点を格納する配列
            int[] array = new int[a];

            for (int i = 0; i <= a - 1; i++) {
                array[i] = sc.nextInt();
            }

            int result = 0;
            for (int j : array) {
                if (j <= b) {
                    result += j;
                }
            }
            System.out.println(result);
        }
}
