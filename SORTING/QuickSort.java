package SORTING;

import java.util.Scanner;

public class QuickSort {

    public static int partition(int a[] ,int low,int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;
    }
    public static void quicksort(int a[],int low,int high){
        if(low<high){
            int pid=partition(a, low, high);
            quicksort(a,low,pid-1);
            quicksort(a, pid+1,high);
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number=");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element=");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        quicksort(a,0,n-1);

        System.out.println("Enter the Sorted Element=");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
