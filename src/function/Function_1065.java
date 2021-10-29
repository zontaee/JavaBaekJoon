package function;

import java.util.Scanner;

public class Function_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = (int) (Math.log10(num) + 1);
        int[] arr = new int[a];
        int count;
        if (num < 100) {
            count = num;
            System.out.println(count);
        } else if(num <1000) {
            count = 99;
            for (int i = 100; i <= num; i++) {
                int abc =i;
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = abc% 10;
                    abc= abc / 10;
                }
                if ((arr[0] - arr[1]) == (arr[1] - arr[2])){

                    count++;
                }

            }
            System.out.println(count);
        }else{
            System.out.println(144);
        }
    }
}
//너무 졸려운 나머지 너무 대충 풀었다 나중에 다시 풀어보자........