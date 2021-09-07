public class TargetSumPair {
    public static void main(String[] args) {

        int[] A = {1,2,2,9,4};
        int n = A.length;
        int K=2;
            int count = 0;
            int i = 0;
            int j = i+1;
            while( i < j && i<A.length-1) {
                System.out.println(A[i]+","+A[j]);
                if(A[i] * A[j] == K*K ){
                    ++count;
                }
                if(j == n-1) {
                    ++i;
                    j=i;
                }
                j++;
            }
            System.out.println(count);




    }
}
