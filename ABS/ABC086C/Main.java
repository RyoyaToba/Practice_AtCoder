package ABS.ABC086C;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();

        int[] t = new int[110000];
        int[] x = new int[110000];
        int[] y = new int[110000];

        // 初期状態
        t[0] = x[0] = y[0] = 0;

        //
        for (int i=0; i<N; i++) {
            t[i+1] = sc.nextInt();
            x[i+1] = sc.nextInt();
            y[i+1] = sc.nextInt();
        }

        boolean can = true;
        for (int i=0; i<N; i++) {
            // 連続する二点間の時間の経過
            int dt = t[i+1] - t[i];
            // x座標の差分とy座標の差分の絶対値の和（マンハッタン距離）
            int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
            // 時間が十分に無ければならない
            if (dt < dist) {
                can = false;
            }
            // distとdtの偶奇は一致しなければならない
            if (dist % 2 != dt % 2) {
                can = false;
            }
        }

        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}