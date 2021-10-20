package For;

import java.util.Scanner;

public class For_8393 {
    public static void main(String[] args) {
        int C;
        int i;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        for(i = 0; i<=C; i++) {
            sum = sum +  i;
        }
        System.out.println(sum);
    }

}
