package BITMANIPULATION;

public class Clear {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask= 1<<pos;
        int newbit= ~(bitmask);
        int result=(newbit&n);
        System.out.println(result);
    }
    
}
