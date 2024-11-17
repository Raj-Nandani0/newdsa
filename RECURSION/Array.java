package RECURSION;

public class Array {
    public static void Dispaly(int a[], int id){
        if(id==a.length){
            return;
        }
        System.out.print(a[id]);
        Dispaly(a, id+1);

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Dispaly(a,0);
    }
    
}
