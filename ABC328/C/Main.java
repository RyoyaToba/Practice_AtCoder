package ABC328.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**　答えは合っていると思われるが、２秒以内に実行完了しなかった。*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        int questionCount = sc.nextInt();
        String targetStr = sc.next();
        String[] targetStrArray = targetStr.split("");

        List<int[]> fromToList = new ArrayList<>();
        for (int i = 1; i <= questionCount; i++) {
            int[] fromTo = new int[2];
            fromTo[0] = sc.nextInt();
            fromTo[1] = sc.nextInt();
            fromToList.add(fromTo);
        }

        for (int fromTo [] : fromToList) {

            int from = fromTo[0];
            int to = fromTo[1];

            String[] target = new String[to - from + 1];

            int k = 0;
            for (int j = from - 1; j < to; j++) {
                target[k] = targetStrArray[j];
                k++;
            }

            int count = 0;

            for (int l = 0; l < target.length; l++) {

                if (l + 1 == target.length) break;
                if (target.length == 1) break;

                if (target[l].equals(target[l + 1])) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
