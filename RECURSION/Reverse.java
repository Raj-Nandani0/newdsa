package RECURSION;

public class Reverse {
    public static void Reverse(String str, int id){
        if(id==0){
            System.out.println(str.charAt(id));
            return;
        }
        System.out.print(str.charAt(id)+" ");
        Reverse(str, id-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        Reverse(str, str.length()-1);
    }
    
}
