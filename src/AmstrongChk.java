public class
AmstrongChk {
    public static void main(String[] args) {
       AmstrongChk ams= new AmstrongChk();

       ams.chkAmstrong(153767);
    }

    public void chkAmstrong(Integer amsno){

        int amsNo = amsno;
        int no = amsno;
        int sumOfDigits = 0;
        while(no!=0) {
            int digit = amsNo % 10;
            sumOfDigits = sumOfDigits + (int) Math.pow(digit, 3);
            amsNo = no/10;
            no = amsNo;
        }
        if(sumOfDigits == amsno){
            System.out.println(true);
        }
    }
}
