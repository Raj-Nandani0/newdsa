package SORTING;
import java.util.Scanner;
public class Intersion {
    public static void main(String[] args) {
        int n,j,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number=");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element=");
        for(int i=0;i<n;i++){
           a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
          temp=a[i];
           j=i;
           while(j>0&&a[j-1]>temp){
               a[j]=a[j-1];
               j=j-1;
           }
           a[j]=temp;
        }
        System.out.println("Enter the sorted Element=");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
        
   }
    
}
