package While;
import java.util.Scanner;

public class While_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x+y);
        }
        sc.close();
    }

}