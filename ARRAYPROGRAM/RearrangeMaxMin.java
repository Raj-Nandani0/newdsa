package ARRAYPROGRAM;

public class RearrangeMaxMin {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int n=a.length;
        int temp[]=new int[n];
        int start=0;
        int end=n-1;
        Boolean flag=true;
        for(int i=0;i<n;i++){
            if(flag){
                temp[i]= a[end--];
            }
            else{
                temp[i]=a[start];
            }
            flag=! flag;
        }
        for(int i=0;i<n;i++){
            a[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        

    }
    
}
