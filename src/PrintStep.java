public class PrintStep {
    public static void main(String[] args) {
        String[] val = new String[5];
        val[0]  ="121";
       int number =5;
        for (int i = 0; i < number; i++) {
            int count = 1;
            if (val.length>1) {
                int j;
                for (j = i + 1; j < val.length; j++) {
                    char first = val[i].charAt(i);
                    char nxtc = val[i].charAt(j);
                    if (first != nxtc) {
                        count=0;
                        val[j]=count+""+val[j].charAt(i);
                        break;
                    }
                    count++;
                }

            }
            else
            {
                System.out.println(count+""+val[0]);
            }

        }
    }
}
