package BITMANIPULATION;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opr=sc.nextInt();
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
         if(opr==1){
            int newbit=bitmask|n;
            System.out.print(newbit);
         }
         else{
            int newbit=~(bitmask);
            int result=(newbit&n);
            System.out.println(result);
         }
    }
    
}
