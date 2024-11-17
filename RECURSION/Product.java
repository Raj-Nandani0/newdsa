package RECURSION;

public class Product {
    public  static  void Product(int a,int b){
        if(a<b)
            return Product(b,a);
        else if(b!=0)
        retrun (a+Product(a,b-1));
        else
           return 0;
    }
    public static void main(String[] agrs){
        int x=5,y=2;
        Product(x, y);
    }
    
}
