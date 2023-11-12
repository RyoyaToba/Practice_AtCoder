package ABS.ABC049C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        while (S.length() > 4) {

            if (S.substring(S.length() - 5).equals("dream") || S.substring(S.length() - 5).equals("erase")) {

                S = S.substring(0, S.length() - 5);

            } else if (S.substring(S.length() - 6).equals("eraser")) {

                S = S.substring(0, S.length() - 6);

            } else if (S.substring(S.length() - 7).equals("dreamer")) {

                S = S.substring(0, S.length() - 7);

            } else {
                break;
            }
        }

        if (S.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
