package ARRAYPROGRAM;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element=");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int last=a[0];
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=last;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
