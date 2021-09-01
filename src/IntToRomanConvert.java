public class IntToRomanConvert {
    public static void main(String[] args) {
        IntToRomanConvert rmcn = new IntToRomanConvert();

        System.out.println(rmcn.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
            int[] no = {1, 5, 10, 50, 100, 500, 1000};
            String romanNo = "IVXLCDM";
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I' && i + 1 == s.length() - 1 && s.charAt(i + 1) != 'I') {
                    sum = sum - no[romanNo.indexOf(s.charAt(i))];
                }
                else if (s.charAt(i) == 'C'  && i<=s.length()-2 && (s.charAt(i + 1) == 'M' || s.charAt(i + 1) == 'D')) {
                    sum = sum - no[romanNo.indexOf(s.charAt(i))];
                }
                else if (s.charAt(i) == 'I' && i<=s.length()-2 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    sum = sum - no[romanNo.indexOf(s.charAt(i))];
                }
                else if (s.charAt(i) == 'X' && i<=s.length()-2 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    sum = sum - no[romanNo.indexOf(s.charAt(i))];
                }
                else {
                    sum = sum + no[romanNo.indexOf(s.charAt(i))];
                }
            }
            return sum;

    }
}
