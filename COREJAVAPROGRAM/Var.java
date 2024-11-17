package COREJAVAPROGRAM;

public class Var {
    static int a=10;
    void fun(){
        int b=10;
        System.out.println(a+" "+b);
        ++a;
        ++b;
    }
    public static void main(String[] args) {
        Var v=new Var();
       v.fun();
       v.fun();

    }
    
}
