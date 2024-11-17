package SORTING;

import java.util.Scanner;
public class Bubble {
     public static void main(String[] args) {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number=");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the unsorted Element=");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Enter the sorted Element=");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
     }
}
