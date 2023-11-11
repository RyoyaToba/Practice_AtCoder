package ABC.ABC081B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        String numString = sc.nextLine();

        int num = Integer.parseInt(numString);

        String numbers = sc.nextLine();

        List<Integer> numList2 = Arrays.asList(numbers.split(" "))
                                     .stream()
                                     .map(e -> Integer.parseInt(e))
                                     .collect(Collectors.toList());

        int count = 0;

        count = checkAllEvens(numList2, count);

        System.out.println(count);

        sc.close();
    }

    private static int checkAllEvens(List<Integer> numList2, int count) {

        boolean allEven = true;

        for (Integer i : numList2) {
            if (i % 2 != 0) {
                allEven = false;
                break;
            }
        }

        if (allEven) {
            count++;
            List<Integer> numList3 = new ArrayList<>();
            for (Integer k : numList2) {
                numList3.add(k / 2);
            }
            count = checkAllEvens(numList3, count);
        }

        return count;
    }

}
