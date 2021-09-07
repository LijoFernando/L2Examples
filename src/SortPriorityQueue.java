    // Java program for the above approach
import java.util.*;

    public class SortPriorityQueue {

        // Function to merge two arrays
        public static void merge(int[] a,int[] b,int n, int m) {

            int[] mergedAry = new int[n+m];
            Queue<Integer> pq= new PriorityQueue<>();

            for(int i:a) {
                pq.add(i);
            }
            for(int i:b) {
                pq.add(i);
            }

            int j=0;
            while(!pq.isEmpty()) {
                mergedAry[j++] = pq.peek();
                pq.remove();
            }

            for (int i: mergedAry){
                System.out.print(i+",");
            }
        }
        public static void main(String[] args)
        {

            // Input
            int A[] = { 5, 6, 8 };
            int B[] = { 2, 3, 8 };

            int N = A.length;
            int M = B.length;

            // Function call
            merge(A, B, N, M);
        }
    }