package RECURSION;

public class Count {
    public static void Display(String str, int id, int count){
        if(id==str.length()-1){
            System.out.print(count);
            return;
        }
        if(id<str.length()){
            count++;
            Display(str, id+1, count);
        }
    }
    public static void main(String[] args) {
        String str="abcdefgh";
        Display(str, 0, 1);

    }
    
}
