package ABC329.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 1; i <= N; i++) {
            A[i-1] = sc.nextInt();
        }
        int max = Arrays.stream(A).max().getAsInt();
        int nextMax = 0;

        for (int a : A) {

            if (nextMax < a && a != max) {
                nextMax = a;
            }
        }

        System.out.println(nextMax);
    }
}
