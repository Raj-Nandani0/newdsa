package COREJAVAPROGRAM;

public class NestedIfElse {
    public static void main(String[] args) {
        int age=18;
        int weight=25;
        if(age<=18){
            if(weight<=25){
                System.out.println("Adult");
            }
            else{
                System.out.println("Not Children");
            }
        }
        else{
            System.out.println("Not Adult");
        }
    }
    
}
