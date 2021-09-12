public class CountZeroInMatrix {

//    Count zeros in a sorted matrix
//    Basic Accuracy: 59.65% Submissions: 18334 Points: 1
//
//    Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.
//
//    Example 1:
//
//    Input:
//    N = 3
//    A = {{0, 0, 0},
//        {0, 0, 1},
//        {0, 1, 1}}
//    Output: 6
//    Explanation:
//    The first, second and third row contains 3, 2 and 1
//    zeroes respectively.
//
//    Example 2:
//
//    Input:
//    N = 2
//    A = {{1, 1},
//        {1, 1}}
//    Output: 0
//    Explanation:
//    There are no zeroes in any of the rows.
//
//    Your Task:
//    You don't need to read input or print anything. Your task is to complete the function countZeros() which takes a 2D matrix as input and returns the number occurring only once.
//
//    Expected Time Complexity: O(N ).
//    Expected Auxiliary Space: O(1).
//
//    Constraints
//0 <   N  <= 103
//            0 <= A[i] <= 1
    public static int countZero(int[][] arr2D){
       int count = 0;
       int i=0;
       int j=0;

       for(; j<arr2D.length; j++){
        //   System.out.println(arr2D[i][j]);
           if(arr2D[i][j] == 0) count++ ;
           if(j == arr2D.length-1){
               if (i == arr2D.length-1 ) {
                   break;
               }
               j=-1;
               i++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        int[][] arr2D={{0, 0, 0},
        {0, 0, 1},
        {0, 1, 1}};
        System.out.println(CountZeroInMatrix.countZero(arr2D));
    }
}
