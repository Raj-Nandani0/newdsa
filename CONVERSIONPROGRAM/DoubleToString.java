package CONVERSIONPROGRAM;

public class DoubleToString {
    public static void main(String[] args) {
        Double val=25.89d;
        String str= val+" ";
        System.out.println(str);
        String gtr="234.90";
        Double data= Double.valueOf(gtr);
        System.out.println(data);
    }
    
}
