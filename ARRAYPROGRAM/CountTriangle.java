package ARRAYPROGRAM;

public class CountTriangle {
    public static void main(String[] args) {
        int a[]={4,6,3,7};
        int count=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]>a[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
