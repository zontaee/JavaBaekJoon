package Array;

import java.util.Scanner;

public class Array_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int temp=0;
        int a=0;
        for(int i = 0; i<arr.length; i++){

           arr[i]=sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==temp){
                a=i+1;
            }
        }
        System.out.println(temp);
        System.out.println(a);
    }
}
