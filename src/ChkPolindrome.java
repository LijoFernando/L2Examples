import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class ChkPolindrome {
    Boolean isPolindrome = true;
    public static void main(String[] args) {

        String word = "veiv";
        ChkPolindrome chkply= new ChkPolindrome();
      //  chkply.checkStringPolindrome(word);
        chkply.chckIntPolindrome();
    }
    public void checkStringPolindrome(String word) {
        int wordSize = word.length();

        for (int i = 0; i < wordSize; i++) {
            char oneChar = word.charAt(i);
            char revChar = word.charAt(wordSize-1-i);
            if(oneChar != revChar) {
                isPolindrome = false;
                break;
            }
        }
        System.out.println(isPolindrome);
    }
    public void chckIntPolindrome( ) {
        int givenNo = 6372736;
        int number = givenNo;
        int reverse = 0;
        Boolean isNoPolindrome = true;

       while(number != 0) {
          int remain = number%10;
          reverse = reverse * 10 + remain;
          number = number/10;
       }
        System.out.println(reverse);
        if(givenNo != reverse){
            isNoPolindrome = false;
        }
        System.out.println(isNoPolindrome);
    }

}
