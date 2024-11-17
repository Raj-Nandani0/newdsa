package ARRAYPROGRAM;

public class PairWiseSwap {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        for(int i=0;i<n;i=i+2){
            if(a[i]<a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
