import java.util.HashMap;
import java.util.Map;

public class RemoveCharacter {
    //input xxxyyzzz op: return 1 or ip: xyyz op: return 0;

    public static int getOutput(String word) {

        Map<Character,Integer> charMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            charMap.put(letter, charMap.getOrDefault(letter,0)+1);
        }

        for (int i:charMap.values()){
            sum+=i;
        }

        int noOfChar = charMap.keySet().toArray().length-1;
//        System.out.println(noOfChar);
//        System.out.println(sum);

        if((sum-1) % noOfChar == 0){
            return 1;
        }
    //    System.out.println(charMap);
        return 0;
    }

    public static void main(String[] args) {
        String word = "xxxxxxxyyyyyyyyzzzzzzzzz";
        System.out.println(RemoveCharacter.getOutput(word));
    }
}
