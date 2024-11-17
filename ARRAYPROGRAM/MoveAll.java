package ARRAYPROGRAM;

public class MoveAll {
    public static void main(String[] args) {
        int a[]={-12,11,-13,-5,6,-7,5};
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                if(i!=j){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
           
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    
    }
    
}
