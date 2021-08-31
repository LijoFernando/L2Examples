public class BinaryFlip {
    public static void main(String[] args) {
        String binaryVal ="010111";
        int size = binaryVal.length()-1;
        Boolean isAlternative = true;
        BinaryFlip bflip = new BinaryFlip();
        if (!binaryVal.contains("11") || !binaryVal.contains("00")) {
            bflip.minFlip(binaryVal);
        }

    }
    public void minFlip(String s) {

    }

}
