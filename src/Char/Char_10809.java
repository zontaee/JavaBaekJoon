package Char;

import java.util.Scanner;

public class Char_10809 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String word = sc.next();
            for (char c = 'a' ; c <= 'z' ; c++)
                System.out.print(word.indexOf(c) + " "); //indexof값이 존재 하지않으면 -1반환
        }
    }