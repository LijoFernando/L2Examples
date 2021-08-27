public class StringContains {
    public static void main(String[] args) {
        String word = "lijo";
        String sentence = "tuaslijodkabchr";
        //String containValue = sentence.substring(sentence.indexOf(word),sentence.indexOf(word.charAt(word.length()-1))+1);
//        if(word.equals(containValue)){
//            System.out.println(sentence+" Contains " +word );
//        }
//        int sentenceSize= sentence.length()-1;
//        int wordSize=word.length()-1;
//           if(sentenceSize > wordSize){
//               String containValue = sentence.substring(sentence.indexOf(word),sentence.indexOf(word.charAt(word.length()-1))+1);
//               System.out.println(containValue);
//           }
//           else {
//            System.out.println(word+" not found");
//        }

               int position = sentence.indexOf(word);
               if (position !=-1) {
                   String containValue = sentence.substring(position, sentence.indexOf(word.charAt(word.length() - 1)) + 1);
                   System.out.println(containValue);
               }
                else {
                   System.out.println(sentence+" not contains"+ word );
               }


    }
}
