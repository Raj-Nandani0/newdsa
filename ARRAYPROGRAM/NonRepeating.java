package ARRAYPROGRAM;

public class NonRepeating {
    public static  int Show(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]!=a[j]){
                    return a[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={-1,2,-1,3,0};
        int n=a.length;
        int result=Show(a,n);
        System.out.println(result);
    }
    
}
