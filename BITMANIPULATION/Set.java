package BITMANIPULATION;

public class Set {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask = 1<<pos;
        int result = bitmask|n;
        System.out.println(result);
    }
    
}
