package ABC328.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            //　月の数
            int a = sc.nextInt();
            // 日付の数
            int[] b = new int[a];
            for (int i = 0; i <= a - 1; i++) {
                b[i] = sc.nextInt();
            }

            int result = 0;

            for (int j = 0; j < b.length; j++) {

                int digitMonth = Integer.toString(j + 1).length();

                List<Integer> z = new ArrayList<>();

                int targetNum2 = j + 1;

                List<Integer> x = getIntegerList(digitMonth, targetNum2);

                for(int k = 1; k <= b[j]; k++) {

                    int digits = Integer.toString(k).length();

                    int targetNum = k;

                    List<Integer> c = getIntegerList(digits, targetNum);

                    boolean allMatch = true;

                    for (int p : x) {
                        if (!allMatch) break;
                        for (int e : c) {
                            if (p == e) {
                                allMatch = true;
                            } else {
                                allMatch = false;
                                break;
                            }
                        }

                    }
                    if (allMatch) {
                        result++;
                    }

                }
            }
            System.out.println(result);
        }

        private static List<Integer> getIntegerList(int digits, int targetNum) {
            List<Integer> c = new ArrayList<>();

            for(int m = 1; m <= digits; m++) {
                int n = targetNum / 10;
                int o = n * 10;
                int l = targetNum - o;
                c.add(l);
                targetNum = n;
            }
            return c;
        }
}


