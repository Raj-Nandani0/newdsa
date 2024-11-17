package ARRAYPROGRAM;

import java.util.Scanner;
public class RightRotation {
    public static void main(String[] args) {
        System.out.println("Enter the Number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element=");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int first=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=first;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    } 
}
