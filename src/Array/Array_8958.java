package Array;

import java.util.Scanner;

public class Array_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] arr = new String[a];
        for(int i = 0; i<arr.length; i++){
            String abc = sc.next();
            arr[i] = abc;
        }
          for(int i=0; i<arr.length;i++){
              int sum= 0;
              int count=0;
            for(int j=0;j<arr[i].length(); j++ ){
                String[] at = arr[i].split("");   //charAt을 사용하면 코드 줄을 아낄 수 있었다.
               if(at[j].equals("O")){                   //다양한 자바 명령어를 알아야 코드수를 줄이고 중복을 방지 할 수 있을거같다.
                 count++;                               //자바를 깊숙히 공부하자 !!
               }else{
                   count = 0;
               }
               sum += count;
            }
            System.out.println(sum);
        }
    }
}
