package If;

import java.util.Scanner;

public class If_1330 {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        if(A<B) {
            System.out.println("<");
        }
        else if(A>B){
            System.out.println(">");
        }
        else {
            System.out.println("==");
        }

    }
}
