package RECURSION;

public class SumofArray {
    public static void Sum(int a[], int sum, int id){
       if(id==a.length){
        System.out.print(sum);
        return;
       }
       if(id<a.length){
        sum+=a[id];
        Sum(a,sum,id+1);
       }
       
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Sum(a, 0,0);

    }
    
}
