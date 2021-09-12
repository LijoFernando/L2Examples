public class CardRotation {
    //    Input:  N = 4  Output: 2 1 4 3
//    Explanation:  We initially have [2 1 4 3]
//    In Step1, we move the first card to the end.    Deck now is: [1 4 3 2]
//    In Step2, we get 1. Hence we remove it. Deck.    now is: [4 3 2]
//    In Step3, we move the 2 front cards ony by one to the end  ([4 3 2] -> [3 2 4] -> [2 4 3]).    Deck now is: [2 4 3]
//    In Step4, we get 2. Hence we remove it. Deck    now is: [4 3]
//    In Step5, the following sequence follows:   [4 3] -> [3 4] -> [4 3] -> [3 4]. Deck now   is: [3 4]
//    In Step6, we get 3. Hence we remove it. Deck   now is: [4] Finally, we're left with a single   card and thus, we stop.
    public static void main(String[] args) {
        int no = 4;
        int[] arrN = new int[no];
        int i = 0;

        System.out.println();
    }

}
