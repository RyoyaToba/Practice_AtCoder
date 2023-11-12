package ABS.ABC083B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> inputList = Arrays.asList(sc.nextLine().split(" "))
                .stream()
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (Integer i = 1; i <= inputList.get(0); i++) {
            // 桁数を取得
            int digits = Integer.toString(i).length();

            int targetNum = i;

            int sum = 0;

            for(int m = 1; m <= digits; m++) {
                int j = targetNum / 10;
                int k = j * 10;
                int l = targetNum - k;
                sum += l;
                targetNum = j;
            }

            if (inputList.get(1) <= sum && sum <= inputList.get(2) ) {
                result.add(i);
            }
        }
        System.out.println(result.stream().reduce(Integer::sum).get());
    }
}
