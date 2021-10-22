package Array;

import java.util.Scanner;

public class Array_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int abc = a * b * c;

        String number = String.valueOf(abc);
        char[] arr = number.toCharArray();
        int[] abcd = new int[arr.length];
        int[] num = new int[10];
        for(int i =0; i<arr.length; i++){
            abcd[i] = Character.getNumericValue(arr[i]);
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (abcd[j]==(i)) {
                    num[i]++;
                }
            }
        }
            for (int i = 0; i <num.length; i++) {
                System.out.println(num[i]);
            }
        }
    }
