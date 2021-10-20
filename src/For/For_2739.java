package For;

import java.util.Scanner;

public class For_2739 {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        for(int i = 1; i<=9 ; i++) {
            System.out.println(A + " * " + i + " = "  + A*i);
        }
    }
}
