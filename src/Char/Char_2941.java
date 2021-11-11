package Char;

import java.util.Scanner;

public class Char_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"dz=","c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String str = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i]))// contain 포함하면 true 반환
                str = str.replace(arr[i], "@"); //일치하는게 있으면 @로 대체
        }
        System.out.println(str.length());
    }
}