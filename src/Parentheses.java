public class Parentheses {

    public static void main(String args[]) {

        String word = "(((ab)(((d))";
        int wordSize = word.length() - 1;
        int[] removeInd = new int[wordSize];

        int j = -1;
        for (int i = 0; i <= wordSize; i++) {
            char letter = word.charAt(i);
            if (letter == '(') {
                for (int k = i + 1; k <= wordSize; k++) {
                    // if(isPara(word.charAt(k)) == false) {
                    //     System.out.print(word.charAt(k));
                    // }
                    if (isCPara(word.charAt(k)) == true) {
                        i = k;
                        break;
                    }
                    if (word.charAt(k) == '(') {
                        removeInd[++j] = i;
                        break;
                    }
                    if (k == wordSize) {
                        j = 0;
                    }
                }
            }
            if (i == wordSize && letter == ')' && removeInd.length > 0) {
                j = 1;
            }
        }
        for (int l = j; l <= wordSize; l++) {
            int m = j;
            while (m <= wordSize) {
                if (j != removeInd[m]) {
                    System.out.print(word.charAt(l));
                    m++;

                }
                break;
            }
        }

    }

    public static boolean isCPara(char letter) {
        if (letter == ')') {
            return true;
        }
        return false;
    }
}
