package Char;

import java.util.Scanner;

public class Char1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] str = new String[a];
         int cnt = a;
        for(int i=0; i<a; i++ ){
            str[i]=sc.next();
            boolean[] arr = new boolean[26]; //boolean 사용 처음생각했다

            for(int k=1; k<str[i].length(); k++){
                if(str[i].charAt(k-1)!=str[i].charAt(k)){
                    if(arr[str[i].charAt(k)-97]==true){
                        cnt--;
                        break;
                    }
                    arr[str[i].charAt(k-1)-97] = true;
                }
            }
        }
  System.out.println(cnt);
    }
}
