package ABS.ABC088B;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        List<Integer> inputList = Arrays.asList(sc.nextLine().split(" "))
                .stream()
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        int result = 0;

            Collections.sort(inputList, Comparator.reverseOrder());

            for (int j = 0; j < inputList.size(); j++) {
                if ((j + 1) % 2 != 0) {
                    result += inputList.get(j);
                } else {
                    result -= inputList.get(j);
                }
            }
        System.out.println(result);
    }
}

