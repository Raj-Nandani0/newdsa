package STRING;

public class Equal {
    public static void main(String[] args) {
        String str="hello";
        String gtr="hello";
        String val= new String("hello");
        //Same address
        System.out.println(str==gtr);
        //difference Address
        System.out.println(str==val);
        // check the same Value
        System.out.println(str.equals(val));
    }
    
}
