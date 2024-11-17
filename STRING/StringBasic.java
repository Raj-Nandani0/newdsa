package STRING;

import java.util.Scanner;
public class StringBasic {
    public static void main(String[] args) {
       /*  System.out.println("Enter the String Element=");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str1=sc.nextLine();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("lhello"));*/
        //CompareTo()
        //str>gtr lexographically(>0)
        //str<gtr <0
        //str  gtr  value
        /*
         abc   abc   0
         bbc > abc   +ve
         abd > abc   +ve
         abc < zbc   _ve
         */
        String str="Hello";
        String gtr= "Dello";
       // System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("llo"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //String str1=str+gtr;
        System.out.println(str.concat(gtr));

    }
    
}