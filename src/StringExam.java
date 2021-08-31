public class StringExam {
    public static void main(String[] args) {
        StringExam strex = new StringExam();
        System.out.println(strex.maxPower("ffffaaattttttara"));
    }

    public int maxPower(String s) {
        int maxi = 0;
        int count = 1;
        for (int j = 0; j < s.length() - 1; j++) {
            if (s.charAt(j) != s.charAt(j + 1)) {
                count = 1;
            }else {
                count++;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}
