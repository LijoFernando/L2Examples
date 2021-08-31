import java.io.BufferedReader;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer strBfr = new java.lang.StringBuffer();
        strBfr.append("hai");
        System.out.println(strBfr);
        System.out.println(strBfr.capacity());
        System.out.println(strBfr.charAt(0));
        System.out.println(strBfr.indexOf("a"));
        System.out.println(strBfr.length());
        System.out.println(strBfr.substring(1));
        System.out.println(strBfr.substring(0,1));
        strBfr.deleteCharAt(0);
       // System.out.println(strBfr.appendCodePoint(1));
        System.out.println(strBfr);





    }
}
