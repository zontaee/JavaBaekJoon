package ArithmeticOperation;

import java.util.Scanner;

public class ArithmeticOperation_2588 {
    public static void main(String[] args) {
        int A;
        int B;



        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();


        System.out.println(A*(B-(B/10)*10));
        System.out.println(A*(B/10-(B/100)*10));
        System.out.println(A*(B/100));
        System.out.println(A*B);






    }
}
