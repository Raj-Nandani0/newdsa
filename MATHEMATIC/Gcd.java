package MATHEMATIC;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int n1,n2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first no.=");
        n1=s.nextInt();
        System.out.println("Enter Second no.=");
        n2=s.nextInt();
        while(n1!=n2){
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        System.out.println(n1);

    }
    
}
