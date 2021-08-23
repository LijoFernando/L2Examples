public class printXPattern {
    static String data = "Program"; //Even count

    public static void main(String[] args) {
        int size= data.length();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j) {
                    System.out.print(data.charAt(j));

                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}