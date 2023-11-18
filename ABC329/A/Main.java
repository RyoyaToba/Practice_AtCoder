package ABC329.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.next().split("");
        int SLen = S.length;

        for (int i = 0; i < SLen; i++) {

            if (i == SLen -1) {
                System.out.print(S[i]);
            } else {
                System.out.print(S[i] + " ");
            }

        }
    }
}
