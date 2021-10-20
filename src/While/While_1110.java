package While;

import java.util.Scanner;

public class While_1110 {
    public static void main(String[] args) {
        boolean run = true;
        int a = 0;
        int b = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = c;
        int sum = 0;
        while (run) {
            a = d / 10;
            b = d % 10;
            sum = a + b;
            if (sum >= 10) {
                sum = sum % 10;
            }
            d = b * 10 + sum;

            if (c == d) {
                run = false;
            }
            count++;
        }
        System.out.println(count);
    }
}
