package ARRAYPROGRAM;

public class Rearrange {
    public static void main(String[] args) {
        int a[]={-1,-1,3,2,-1,4};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j]==i){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=i){
               a[i]=-1;
            }
        }
       
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}
