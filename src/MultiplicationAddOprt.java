public class MultiplicationAddOprt {
    public static void main(String[] args) {
        MultiplicationAddOprt mull= new MultiplicationAddOprt();
        System.out.println(mull.mul(23,3));
    }
    public int mul(int n,int m){
        int mul=0;
        for (int i = 0; i < m; i++) {
            mul = mul + n;
        }
        return mul;
    }
}
