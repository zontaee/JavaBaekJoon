package For;

import java.util.Scanner;

public class For_11022 {
    public static void main(String[] args) {
        int T;
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int i = 1; i<=T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = a + b;
            System.out.println( "Case #"+i+": " + a + " + " + b + " = " + sum);
        }


    }
}
