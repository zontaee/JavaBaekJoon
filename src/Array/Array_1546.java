package Array;

import java.util.Scanner;

public class Array_1546 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        double sum = 0;
        int max =0;
        for(int i = 0; i<arr.length; i++){
            int b= sc.nextInt();
            arr[i]= b;
            if(max<arr[i]){
                max=(int)arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            arr[i]= arr[i]/max*100;
            sum+=arr[i];
        }
        System.out.printf( "%.2f%n",sum/a);
    }
}
