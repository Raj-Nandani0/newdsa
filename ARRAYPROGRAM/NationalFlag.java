package ARRAYPROGRAM;

public class NationalFlag {
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2};
        int n=a.length;
        int C0=0;
        int C1=0;
        int C2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                C0++;
            }
            else if(a[i]==1){
                C1++;
            }
            else{
                C2++;
            }
        }
        int id=0;
        for(int i=0;i<C0;i++){
            a[id++]=0;
        }
        for(int i=0;i<C1;i++){
            a[id++]=1;
        }
        for(int i=0;i<C2;i++){
            a[id++]=2;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
      
    }
}
