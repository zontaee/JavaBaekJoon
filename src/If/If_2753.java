package If;

import java.util.Scanner;

public class If_2753 {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        if(A%400 ==0) {
            System.out.println("1");
        }
        else {
            if(A%4==0 && !(A%100==0)) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }

    }
}
