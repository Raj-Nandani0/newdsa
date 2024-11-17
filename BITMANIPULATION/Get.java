package BITMANIPULATION;

public class Get {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitman=1<<pos;

        if((bitman & n)==0){
            System.out.print("Bit was zero");
        }
        else{
            System.out.print("Bit was one");
        }
    }
    
}
