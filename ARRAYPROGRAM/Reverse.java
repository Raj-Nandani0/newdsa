package ARRAYPROGRAM;

import java.util.Scanner;
public class Reverse {
     public static void main(String[] args) {
        System.out.println("Enter the Number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the Element=");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

     }
}
