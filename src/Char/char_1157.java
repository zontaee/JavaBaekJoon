package Char;

import java.util.Scanner;

public class char_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Character[] c = new Character[26];
        int[] n = new int[26];
        int max = 0;
        int cnt = 0;
        char abc='a';
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) (65 + i);
        }
        for (int j = 0; j < c.length; j++) {
            for (int i = 0; i < a.length(); i++) {
                char b = a.charAt(i);
                if (Character.toLowerCase(b) == Character.toLowerCase(c[j])) {
                    n[j]++;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] == max) {
                cnt++;
                abc = c[i];
            }
        }
            if(cnt>1){
                System.out.println("?");
            }
            else{
                System.out.println(abc);
            }

    }
}
//너무 if문과 for문이 많다 좋은 코드가 아니다... java공부를 더해서 효율적인 코드를 짜야한다.