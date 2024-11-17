package RECURSION;

public class Sorted {
    public static boolean sorted(int a [], int id){
         if(id==a.length-1){
            return true;
         }
         if(a[id]<a[id+1]){
            return sorted(a,id+1);
         }
         else{
            return false;
         }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.print(sorted(a,0));
    }
    
}
