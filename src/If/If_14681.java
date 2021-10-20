package If;

import java.util.Scanner;

public class If_14681 {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if(A>0 && B>0) {
            System.out.println("1");
        }
        else if	(A>0 && B<0) {
            System.out.println("4");
        }
        else if	(A<0 && B<0) {
            System.out.println("3");
        }
        else
            System.out.println("2");
    }
}
