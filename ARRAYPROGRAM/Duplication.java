package ARRAYPROGRAM;

public class Duplication {
    public static void main(String[] args) {
        int a[]={1,2,3,6,3,6,1};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
    
}
