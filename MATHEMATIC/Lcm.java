package MATHEMATIC;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        int n1,n2,lcm;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  first No.=");
        n1=s.nextInt();
        System.out.println(" Enter Second No.=");
        n2=s.nextInt();
        lcm=(n1>n2)?n1:n2;
        while(true){
        if(lcm%n1==0 && lcm%n2==0){
            System.out.println(lcm);
            break;
            
        }
        ++lcm;
    }

    }
    
}
