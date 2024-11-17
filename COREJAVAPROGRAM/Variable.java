package COREJAVAPROGRAM;

public class Variable {
    int a=10;
     static int b=20;
     public static void main(String[] args) {
        Variable var=new Variable();
        int c=30;
        System.out.println("instance variable="+ var.a+" ");
        System.out.println("Local Variable="+c);
        System.out.println("Staic variable="+Variable.b);

     }
    
}
