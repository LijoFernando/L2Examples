import java.util.*;

public class WeightageOfNo {
    static int[] setOfNumber={10,36,54,89,12};
    static List weightList = new ArrayList();
    static int[] weightage= new int[setOfNumber.length] ;
    static int score = 0;
    public static void main(String[] args) {
        for(int i = 0; i < setOfNumber.length; i++) {
            int number = setOfNumber[i];
            int sqrVal= (int) Math.sqrt(number);
            if(Math.pow(sqrVal,2)==number){
                score = score + 5;
            }
            if (number % 6 == 0 ) {
                score = score + 4;
            }
            if(number % 2 == 0){
                    score = score + 3;
            }
            System.out.println(score);
            score = 0;
        }

    }
}
