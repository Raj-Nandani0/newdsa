package SORTING;

import java.util.Scanner;
public class Selection {
     public static void main(String[] args) {
        int n,i,j,min,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number=");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter theElement=");
        for(i=0;i<n;i++){
          a[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
          min=i;
          for(j=i+1;j<n;j++){
               if(a[j]<a[min])
               min=j;
          }
          temp=a[i];
          a[i]=a[min];
          a[min]=temp;
        }
        for(i=0;i<n;i++){
          System.out.println(a[i]);
        }
     }
}
