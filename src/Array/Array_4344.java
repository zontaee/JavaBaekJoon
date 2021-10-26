package Array;

import java.util.Scanner;

public class Array_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        double[] arr = new double[a];
        double[] arr2 = new double[a];
        for(int i=0; i<arr.length;i++){
             b = sc.nextInt();
             double[] num = new double[b];
             double sum=0;
             double count=0;
             for(int j=0; j<num.length; j++){
                 num[j]=sc.nextDouble();
                 sum += num[j];
             }
             arr[i]=sum/num.length;
             for(int k=0; k<num.length; k++){
                 if(num[k]>arr[i]){
                     count++;
                 }
             }
         arr2[i]=(count/b)*100;
        }
        for(int i=0; i<arr.length; i++){
            System.out.printf("%.3f%%%n",arr2[i]);

        }
    }
}
