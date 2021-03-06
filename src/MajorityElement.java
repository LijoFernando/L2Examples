import java.util.*;

public class MajorityElement {

//    Majority Element
//    Easy Accuracy: 48.6% Submissions: 100k+ Points: 2
//    Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
//
//    Example 1:
//    Input:
//    N = 3
//    A[] = {1,2,3}
//    Output:
//            -1
//    Explanation:
//    Since, each element in
//    {1,2,3} appears only once so there
//    is no majority element.
//
//    Example 2:
//
//    Input:
//    N = 5
//    A[] = {3,1,3,3,4,4,4,2}
//    Output:
//            3
//    Explanation:
//    Since, 3 is present more
//    than N/2 times, so it is
//    the majority element.
//
//    Your Task:
//    The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
//
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(1).
//
//    Constraints:
//            1 ≤ N ≤ 107
//            0 ≤ Ai ≤ 106

    private static void getMajorElement(int[] arr){
        int element = 0 ;
        int count = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[1, 2, 3, 3, 3, 4, 4, 4, 4]
        Map<Integer,Integer> hMap = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            hMap.put(arr[i-1],hMap.getOrDefault(arr[i-1],0)+1);
            if(i == arr.length-1){
                hMap.put(arr[i],hMap.getOrDefault(arr[i],0)+1);
            }
            if(arr[i] != arr[i-1] || i == arr.length-1) {
               count = hMap.get(arr[i-1]);
               if(element == 0 || count > hMap.get(element)){
                   element = arr[i-1];
               }
            }

        }
        System.out.println(hMap.entrySet()+" ,"+element);
    }

    public static void main(String[] args) {
        int[] arr={3,1,3,3,4,4,4,5};
        getMajorElement(arr);
    }
}
