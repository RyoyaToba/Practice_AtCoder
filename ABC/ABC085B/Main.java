package ABC.ABC085B;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> mochiBox = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            mochiBox.add(sc.nextInt());
        }

        Collections.sort(mochiBox, Comparator.reverseOrder());

        int mochiDan = 0;
        int bottom = 101;

        for (int i = 0; i < mochiBox.size(); i++) {

            if (bottom > mochiBox.get(i)) {
                mochiDan++;
                bottom = mochiBox.get(i);
            }
        }
        System.out.println(mochiDan);
    }
}
