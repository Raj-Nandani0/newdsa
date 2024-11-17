package COREJAVAPROGRAM;

public class Student {
    String name;
    int id;
    public void student(){
        System.out.println(name+" "+id);
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.name="Raj Nandani";
        st.id=121;
        st.student();
    }
}
