package Char;

import java.util.Scanner;

public class char_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); //문자열 앞뒤 공백제거 trim()
        String[] arr =str.split(" ");
        if(str.isEmpty()){ //비었으면 0출력
            System.out.println(0);
        }else {
            System.out.println(arr.length);
        }
    }
}
