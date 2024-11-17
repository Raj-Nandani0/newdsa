package ARRAYPROGRAM;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeLargest {
public static void main(String[] args) {
    System.out.println("Enter the Number=");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println(" Enter the Element=");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=n-1;i>=2;i--){
        System.out.print(a[i]+" ");
    }
}
}
