import java.util.*;
public class SortByFactor {
    int value;

    public static void main(String[] args) {
        int[] no ={5, 11, 10, 20, 9, 16, 23} ;
//        Input : {5, 11, 10, 20, 9, 16, 23} link: https://tutorialspoint.dev/algorithm/sorting-algorithms/sort-elements-basis-number-factors
//       Expected Output : 20 16 10 9 5 11 23 https://www.geeksforgeeks.org/sort-elements-basis-number-factors/
        System.out.println(Arrays.toString(no));
        SortByFactor obj = new SortByFactor();
        obj.sortByFactor(no);
    }

    public static void sortByFactor(int[] ele){
        int j=-1;
        int[] countFact = new int[ele.length];
        for (int i: ele){
            countFact[++j]=SortByFactor.fact(i);
        }
        System.out.println(Arrays.toString(countFact));
        SortByFactor.swap(countFact , ele);
    }

    public static int fact(int n) {
        int count = 0;
        int sq = (int) Math.sqrt(n);
        if(sq*sq==n) count++;
        for (int i = 1; i <Math.sqrt(n); i++) {
            if(n%i==0){
                count+=2;
            }
        }
        return count;
    }

    public static void swap(int[] cntFact , int[] no){
        for (int j= 0; j< cntFact.length; j++){
            for (int i = 0; i < cntFact.length - j - 1; i++) {
                int curnt = cntFact[i];
                int k =i+1;
                int nxt = cntFact[k];
                if (curnt < nxt) {
                    cntFact[k] = curnt;
                    cntFact[i] = nxt;
                    int temp = no[k];
                    no[k] = no[i];
                    no[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cntFact));
        System.out.println(Arrays.toString(no));
    }
}
