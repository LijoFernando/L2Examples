public class printXPattern {
    //Even count

    public static void main(String[] args) {

        String data = "Program";
        int size= data.length();
        for(int i=0; i<size; i++){
            for (int j = 0; j < size; j++) {
                if(j==i | j==size-i-1) {
                    System.out.print(data.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}