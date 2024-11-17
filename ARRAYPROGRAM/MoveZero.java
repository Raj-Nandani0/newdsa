package ARRAYPROGRAM;

public class MoveZero {
    public static void main(String[] args) {
        int a[]={1,2,0,3,0,5,0,4,5};
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++){
             if(a[i]!=0){
                a[j]=a[i];
                j++;
             }
        }
        for(;j<n;j++){
            a[j]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
