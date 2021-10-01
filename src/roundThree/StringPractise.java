package roundThree;

import java.util.Arrays;

public class StringPractise {
    public static void getEvent(String str) {
        String[] words = str.split(" ");
        String time = words[words.length - 1];
        //System.out.print(Arrays.toString(words) + "\n" + time);
        String EventName = "";
        int duration = 0;
        for (int i = 0; i < words.length - 1; i++) EventName += words[i] + " ";
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == 'Y') break;
            duration = (duration * 10) + ((int) time.charAt(i) - (int) '0');
            // System.out.print("["+(int) time.charAt(i)+"- "+(int)'0'+"]");
        }
        System.out.println(EventName + " @ " + duration + "Y");
    }

    public static void main(String[] args) {
        String sentence = "I am Working at Zoho Since 2021Y";
        getEvent(sentence);
    }
}
