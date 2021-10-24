package Array;

import java.util.HashSet;
import java.util.Scanner;

public class Array_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<Integer>();
        int count=0;
        for(int i=0; i<10;i ++){
            num.add(sc.nextInt()%42);
        }

        System.out.println(num.size());
    }
}
