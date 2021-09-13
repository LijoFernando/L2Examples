import java.util.*;

public class WeightageOfNo {

    public static int factCount(int val) {
        int count = 0;
        int sq = (int) Math.sqrt(val);
        if(sq*sq == val){
            count++;
        }
        for (int i = 1; i < Math.sqrt(val); i++) {
            if(val % i == 0) {
                count+=2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arrVal = {10,36,54,89,12};
        int size = arrVal.length;
        int[] arrfact = new int[size];
        for (int i = 0; i < size; i++) {
            arrfact[i]=WeightageOfNo.factCount(arrVal[i]);
        }
    }

}
