package If;

import java.util.Scanner;

public class If_2884 {

    public static void main(String[] args) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if(B-45<0) {
            if(A==0) {
                System.out.println(23 +" "+(60+B-45));
            }
            else{
                System.out.println(A-1+" "+(60+B-45));
            }
        }
        else {
            System.out.println(A + " " + (B-45));

        }

    }
}
