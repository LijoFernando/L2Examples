public class BinaryFlip {

    public static void main(String[] args) {
        String binaryVal = "101110";
        int size = binaryVal.length() - 1;
        Boolean isAlternative = true;
        BinaryFlip bflip = new BinaryFlip();
        bflip.minFlip(binaryVal);
    }

    public void minFlip(String s) {
        int size = s.length();
        String removedS = s + s;
        int sizeRmvS =removedS.length();
        System.out.println(removedS);
        String alt1 ="";
        String alt2 ="";
        for (int i = 0; i <sizeRmvS; i++) {
            if(i%2==0) {alt1=alt1+""+"1"; alt2=alt2+""+"0";}
            else {alt1=alt1+""+"0"; alt2=alt2+""+"1";}
        }
        for (int i = 0; i <size; i++) {
            int count=0;
            for (int j = i+1; j < size+i+1; j++) {
              //  if                System.out.print(removedS.charAt(j));
            }
            System.out.println();
        }

        System.out.println(alt1);
        System.out.println(alt2);

//        System.out.println(removedS);
//        int count=0;
//        for (int i = 0; i <s.length()-2; i++) {
//            if(removedS.charAt(i)!=removedS.charAt(i+1)) {
//               break;
//            }
//            removedS = removedS.substring(i+1)+""+removedS.charAt(i);
//        }
//        System.out.println(removedS);
//
//        for(int k=0; k<removedS.length()-2;k++){
//            char fstChr = removedS.charAt(k);
//            char nxtChr =removedS.charAt(k+1);
//            if(fstChr==nxtChr){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
    }
}
