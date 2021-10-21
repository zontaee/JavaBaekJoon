package Array;

import java.util.Scanner;
public class Array_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = -1000000;
        int temp1 = 1000000;
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if (temp1 > arr[i]) {
                    temp1 = arr[i];
                }
            }
            System.out.println(temp1);
            System.out.println(temp);

        }
    }

