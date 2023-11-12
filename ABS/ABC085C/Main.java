package ABS.ABC085C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 枚数
        int amount = sc.nextInt();
        // 合計金額
        int sum = sc.nextInt();

        int[] osatsuCount = new int[3];

        List<int[]> hairetsuList = new ArrayList<>();

        boolean atta = false;

        for (int i = amount; i >= 0; i--) {

            int amount2 = amount - i;

            if (atta) break;

            for (int j = amount2; j >= 0 ; j--) {

                int amount3 = amount2 - j;

                if (atta) break;

                for (int k = 0; k <= amount3; k++) {

                    osatsuCount[0] = i;
                    osatsuCount[1] = j;
                    osatsuCount[2] = k;

                    if (i + j + k == amount) {
                        int goukei = i * 10000 + j * 5000 + k * 1000;
                        if (goukei == sum) {
                            System.out.println(i + " " + j + " " + k);
                            atta = true;
                            break;
                        }
                    }
                }
            }
        }
        if (!atta) {
            System.out.println(-1 + " " + -1 + " " + -1);
        }
    }
}
