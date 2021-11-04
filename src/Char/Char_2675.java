package Char;

import java.util.Scanner;

public class Char_2675 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        for(int i = 0; i < a; i++) {

            int b= in.nextInt();
            String str = in.next();

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < b; k++) {
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
