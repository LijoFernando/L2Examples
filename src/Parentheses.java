public class Parentheses {
    public class MyClass {
        public static void main(String args[]) {

            String word = "((ab)((d))";
            int wordSize = word.length();
            int[] removeInd = new int[wordSize];
            int j = 0;

            for (int i=0; i<wordSize-1; i++) {
                char letter = word.charAt(i);

                if(letter == '(' ) {
                    for (int k=i+1; k<wordSize-1; k++) {
                        // if(isPara(word.charAt(k)) == false) {
                        //     System.out.print(word.charAt(k));
                        // }

                        if ( isCPara(word.charAt(k)) == true ) {
                            removeInd[j-1] = 0;
                            j--;
                            break;
                        }

                        if ( word.charAt(k)== '(') {
                            removeInd[j] = k-1;
                            j++;
                            break;
                        }

                    }
                }
            }

            for (int i =0; i<removeInd.length; i++) {
                System.out.println(removeInd[i]);
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

}
