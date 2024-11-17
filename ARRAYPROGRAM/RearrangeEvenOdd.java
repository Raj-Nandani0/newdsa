package ARRAYPROGRAM;

public class RearrangeEvenOdd {
    public static void main(String[] args) {
        int a[]={1,2,2,1};
        int n=a.length;
        for(int i=0;i<n;i=i+2){
           if(a[i]>a[i+1]){
             int temp=a[i];
             a[i]=a[i+1];
             a[i+1]=temp;
           }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
    
}
