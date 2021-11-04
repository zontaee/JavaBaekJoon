package Char;

import java.util.Scanner;

public class Char_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aaa=0;
        int bbb=0;
        String a = sc.next();
        String b = sc.next();
        Character[] aa = new Character[3];
        Character[] bb = new Character[3];
        for(int i= 0; i<aa.length; i++) {
            aa[i] = a.charAt(2 - i);
            bb[i] = b.charAt(2 - i);
        }
        for(int i= 0; i<bb.length; i++){
            aaa+= Integer.valueOf(aa[2-i]-48)*Math.pow(10, i);
            bbb+= Integer.valueOf(bb[2-i]-48)*Math.pow(10, i);
        }
        if(aaa>bbb)
            System.out.println(aaa);
        else
            System.out.println(bbb);
    }
}
