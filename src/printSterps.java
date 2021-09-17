public class printSterps {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        String str = "1";
        StringBuffer strBfr = new StringBuffer();
        while (n <= 1) {
            count = 1;
            for (int i = 0; i < str.length(); i++) {
                int no = 0;
                if (str.length() != 0) {
                    no = 1;
                }
                for (int j = i + no; j < str.length(); j++) {
                    System.out.println(count + " " + str.charAt(i));
                    if (str.charAt(i) != str.charAt(j)) {
                        strBfr.append(str.charAt(i));
                        strBfr.append(count);
                        System.out.println(str.charAt(i) + " " + count + ", ");
                        i = j;
                        break;
                    }
                    if (str.length() - 1 != 0) {
                        count++;
                    }
                    System.out.println(count + " " + str.charAt(i));
                }
                n++;
            }
        }
        System.out.println(count);
    }
}
