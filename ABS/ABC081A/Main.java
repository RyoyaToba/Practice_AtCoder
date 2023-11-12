package ABS.ABC081A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String inputNum = sc.next();

        String[] array = inputNum.split("");
        
        int count = 0;

        for (String num : array) {
            if (num.equals("1")) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
