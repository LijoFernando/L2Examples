public class MaxMinArray {
    public static void main(String[] args) {
        int[] chars ={2,5,1,4,6};
        int max = chars[0];
        int min = chars[chars.length-1];
        for (int ktr: chars) {
            if (ktr > max) {
                max = ktr;
            }
            if(ktr <= min) {
                min = ktr;
            }
        }
        System.out.println(min+ " "+max);
    }
}
