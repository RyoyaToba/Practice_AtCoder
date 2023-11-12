package ABS.ABC087B;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gohyaku = sc.nextInt();
        int hyaku = sc.nextInt();
        int goju = sc.nextInt();
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= gohyaku; i++) {
            for (int j = 0; j <= hyaku; j++){
                for (int k = 0; k <= goju; k++){

                    int sum = i * 500 + j * 100 + k * 50;

                    if (sum == target) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
