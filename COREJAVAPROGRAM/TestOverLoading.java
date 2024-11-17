package COREJAVAPROGRAM;

public class TestOverLoading {
    public static void main(String[] args) {
        main(10);
        main("Hello World!");
    }
    public static void main(int a) {
        System.out.println(a);
    }
    public static void main(String b) {
        System.out.println(b);
        
    }
    
}
