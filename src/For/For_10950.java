package For;

import java.util.Scanner;

public class For_10950 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        for(int i = 0; i<C; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }

    }
}
