package For;

import java.util.Scanner;

public class For_2438 {
    public static void main(String[] args) {
        int T;


        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int i = 1; i<=T; i++ ) {
            for(int j = 0; j<i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
