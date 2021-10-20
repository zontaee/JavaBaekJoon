package For;

import java.util.Scanner;

public class For_10871 {
    public static void main(String[] args) {
        int T;
        int C;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        C = sc.nextInt();
        int[] arr = new int[T];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<arr.length; j++) {
            if(arr[j] >= C) {
                continue;
            }
            System.out.print(arr[j] + " ");
        }




    }
}
