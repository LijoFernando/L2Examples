import java.util.*;

public class SearchGreaterMarks {
    //    There are N students in a class. Each student got arr[i] (1 <= i <= N) marks in mathematics exam. Geek loves mathematics and he got X marks. Now geek is curious to know, how many students in his class got marks greater than that of Geek's.
//
//    Input Format:
//    The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases is as follows:
//
//    The first line of each test case contains two space-separated integers N and X.
//    The second line contains N space-separated positive integers representing array arr[ ].
//
//
//    Output Format:
//    In a new line, for each test case, print the count of students who got marks greater than X.
//
//            Constraints:
//            1 <= T <= 10
//            1 <= N <= 100000
//            1 <= arr[i], K <= 100000
////    Example:
////    Sample Input:
//            2
//            3 2
//            4 1 3
//            4 9
//            4 8 1 2
//    Sample Output:
//            2
//            0
//
//    Explanation:
//    Testcase 1: Students with marks 4 and 3
//    got higher marks than Geek who got 2 marks.
    static Scanner input = new Scanner(System.in);


    public static void getStudentMark(int student,int x ) {
        int count = 0;
        int arr[] = new int[student];
        for (int i = 0; i < student; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int testCase = input.nextInt();
        for (int i = 0; i < testCase; i++) {
            int student = input.nextInt();
            int target = input.nextInt();
            SearchGreaterMarks.getStudentMark(student,target);
        }
    }

}
