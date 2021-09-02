public class DecimalToBinry {
    public static void main(String[] args) {

    }
    public String dTBbfMethod(int deci){
        int rem = 0;
        StringBuilder binary = new StringBuilder();
        for(int i =0;i<deci; i++) {
            rem=deci/2;
            binary.append(String.valueOf(deci%2));
            deci = rem;
            if(rem == 1){
                binary.append(String.valueOf(deci%2));

                break;
            }
        }
        return binary.reverse().toString();
    }
   // String binary ="";
//    public int dTBRC(){
//        if(rem == 1){
//            return
//        }
//
//        return binary+dTBRC(deci%2);
//    }
}
