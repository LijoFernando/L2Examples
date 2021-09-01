public class BinaryFlip {
    public static void main(String[] args) {
        String binaryVal ="101110";
        int size = binaryVal.length()-1;
        Boolean isAlternative = true;
        BinaryFlip bflip = new BinaryFlip();
        bflip.minFlip(binaryVal);
    }
    public void minFlip(String s) {
        String removedS = s;
        System.out.println(removedS);
        int count=0;
        for (int i = 0; i <s.length()-2; i++) {
            if(removedS.charAt(i)!=removedS.charAt(i+1)) {
               break;
            }
            removedS = removedS.substring(i+1)+""+removedS.charAt(i);
        }
        System.out.println(removedS);

        for(int k=0; k<removedS.length()-2;k++){
            char fstChr = removedS.charAt(k);
            char nxtChr =removedS.charAt(k+1);
            if(fstChr==nxtChr){
                count++;
            }
        }
        System.out.println(count);
    }
}
