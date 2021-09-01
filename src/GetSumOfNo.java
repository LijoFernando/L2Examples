public class GetSumOfNo {
//    Given unsorted array find all combination of the element
//    for a given sum. Order should be maintained.
//    Input :
//            8 3 4 7 9 N=7
//    Output
//    {3 4 } {7}
    public static void main(String args[]) {
        int [] intAry= {2,1,3,4,6,7,9};
        int size = intAry.length;
        int no = 4;
        int [] minAry = new int[size];


        for (int i = 0; i <size-1; i++) {
            int fst = intAry[i];
            int sum = fst;

            for (int j = i; j <size-1; j++) {
                int nxt = intAry[j];
                sum = sum + nxt;
                if(sum - no == 0) {
                    System.out.println(sum);
                    sum=0;
                    break;
                }
                if(sum>no){
                 break;
                }
            }
        }
    }
}
