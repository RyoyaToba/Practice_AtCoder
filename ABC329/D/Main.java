package ABC329.D;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    /**
     * (参加者, 投票数)を連想配列で考えた時に、
     * (1,2), (2,2), (3,1)のように管理できる。出力すべきは、参加者番号の最小かつ投票数の最大なので、投票数をマイナスとかで置いといて、
     * (1,-2), (2,-2), (3,-1)の最小を求めればいい。
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 参加人数
        int N = sc.nextInt();
        // 投票数
        int M = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(Integer.toString(i), 0);
        }

        for (int i = 1; i <= M; i++) {
            int C = sc.nextInt();
            int vote = map.get(Integer.toString(C));
            map.put(Integer.toString(C), vote + 1);

            System.out.println(calcMax(map));
        }
    }

    private static String calcMax (Map<String, Integer> map) {

        int max = 0;
        String maxPerson = "";
        for (String key : map.keySet()) {

            if (max < map.get(key)) {
                max = map.get(key);
                maxPerson = key;
            }

            if (max == map.get(key)) {
                maxPerson = key;
            }
        }
        return maxPerson;
    }
}
