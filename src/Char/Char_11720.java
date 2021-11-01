package Char;

import java.util.Scanner;

public class Char_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr= new int[a];
        String b;
        b = sc.next();
        int sum=0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = b.charAt(i);        //  b.charAt("")문자열를 char 형태로 하나씩 자를수 있따
            sum+=(int)arr[i] - 48;
        }
        System.out.println(sum);

    }
}
