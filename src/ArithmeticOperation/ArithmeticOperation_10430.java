package ArithmeticOperation;

import java.util.Scanner;

public class ArithmeticOperation_10430 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;


        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.println( (A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println( (A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);



    }
}
