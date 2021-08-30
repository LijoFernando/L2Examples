public class Parentheses {

        public static void main(String args[]) {

            String word = "(((ab)(((d))";
            int wordSize = word.length();
            int[] removeInd = new int[wordSize];

            int j = -1;
            for (int i=0; i<=wordSize-1; i++) {
                char letter = word.charAt(i);
                if(letter == '(' ) {
                    for (int k=i+1; k<=wordSize-1; k++) {
                        // if(isPara(word.charAt(k)) == false) {
                        //     System.out.print(word.charAt(k));
                        // }
                        if ( isCPara(word.charAt(k)) == true ) {
                            System.out.println(word.charAt(i)+": index is"+i+" and "+word.charAt(k)+": index is"+k);
                            i = k;
                            break;
                        }
                        if ( word.charAt(k) == '(') {
                            removeInd[++j] = i;
                            break ;
                        }
                    }
                }
            }
            for(int l:removeInd) {
                System.out.println(l);
            }

        }




        public static boolean isCPara(char letter){
            if(letter == ')') {
                return true;
            }
            return false;
        }
}
