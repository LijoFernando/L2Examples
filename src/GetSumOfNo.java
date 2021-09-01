public class GetSumOfNo {
    //    Given unsorted array find all combination of the element
//    for a given sum. Order should be maintained.
//    Input :
//            8 3 4 7 9 N=7
//    Output
//    {3 4 } {7}
//    public static void main(String args[]) {
//        int[] intAry = {-2,-3,4,-1,-2,1,5,-3};
//        int size = intAry.length;
//        int totalsum = 0;
//        for (int i = 0; i < size; i++) {
//            totalsum += intAry[i];
//        }
//        for (int i = 0; i < size; i++) {
//            int[] sum = new int[size];
//            sum[i] = totalsum - intAry[i];
//            System.out.println(sum[i]);
//        }
//       // System.out.println(sum);
   // }
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];   //-2,-3,4,3
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;//~~-2~~,-3~~~,4
            if (max_ending_here < 0)
                max_ending_here = 0;//4
        }
        return max_so_far;//~~-2~~,-3~~,4
    }
}
