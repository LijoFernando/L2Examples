public class UnbalancedPranthese {
       public static void main(String args[]) {
            String word = "((ab)((d))";
            int wordSize = word.length();
            int[] removeInd = new int[wordSize];
            int j = 0;

            for (int i=0; i<wordSize-1; i++) {
                char letter = word.charAt(i);
                if(letter == '(' ) {
                    for(int k=i+1; k<wordSize-1; k++ ) {
                        if(isPara(word.charAt(k)) == true) {
                            k++;
                            System.out.print(word.charAt(k));
                        }

                        else if(isCPara(word.charAt(k)) == true) {
                            break;
                        }

                        else {
                             removeInd[j] = k;
                             break;
                        }
                    }
                }
                else if(letter == ')') {
                    removeInd[j] = i;
                    j++;
                }
            }
           for(int i =0; i<removeInd.length; i++){
               System.out.print(removeInd[i]);
           }

        }

        public static boolean isCPara(char letter){
            if(letter == ')') {
                return true;
            }
            else {
                return false;

            }
        }

        public static boolean isPara(char letter) {
            if(letter == '(' | letter == ')') {
                return true;
            }
            return false;
        }

}
