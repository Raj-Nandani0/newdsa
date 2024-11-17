package ARRAYPROGRAM;

public class AddNum {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            if(a[i]<9)
            {
                a[i]++;
                break;
            }
            a[i]=0;
        }
        a[0]=1;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
