package ARRAYPROGRAM;

public class CommanEle {
    public static void main(String[] args) {
        int a[]={1,5,10,20,30};
        int b[]={5,13,15,20};
        int c[]={5,10};
        int i=0,j=0,k=0;
        int n=a.length;
        int m=b.length;
        int l=c.length;
        while(i<n && j<m && k<l){
            if(a[i]==b[j]&& b[j]==c[k]){
                System.out.println(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<c[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
    
}
