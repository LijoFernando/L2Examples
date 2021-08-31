public class BinaryFlip {
    public static void main(String[] args) {
        String binaryVal ="010111";
        int size = binaryVal.length()-1;
        Boolean isAlternative = true;
        for (int i = 0; i <size; i++) {
            int j=i+1;
            char firstchar = binaryVal.charAt(i);//  System.out.println(firstchar);
            char nxtchar = binaryVal.charAt(j);//  System.out.println(nxtchar);
            if((firstchar == '0' && nxtchar == '0') || (firstchar == '1' && nxtchar =='1') ){
                isAlternative =false;
                System.out.println("not alternative");
                break;
            }
            i=j+1;
        }
    }
}
