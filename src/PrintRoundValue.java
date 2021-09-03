import java.sql.SQLOutput;

public class PrintRoundValue {
    public static void main(String[] args) {
        double number = 000-0011.0;
        System.out.println(number);
        //System.out.println(PrintRoundValue.nocheck(number));
        System.out.println(PrintRoundValue.avoidSymbol(number));
    }

    public static int nocheck(double n) {
        String number = String.valueOf(n);
        String rounded = "";
        int round = 0;
       // 00-0001234 = -1234(error)
        //double to round the value(9.4 = 9, 9.5=10)
        for (int i = 0; i < number.length(); i++) {
            char letter = number.charAt(i);
            if (letter == '.' && i <= number.length() - 2) {
                if (Character.getNumericValue(number.charAt(i + 1)) < 5) {
                    round = Integer.parseInt(rounded);
                    return round;
                }
                round = Integer.parseInt(rounded) + 1;
                return round;
            }
            rounded = rounded + letter;
        }
        return round;
    }

    public static int avoidSymbol(double n) {
        int no = (int) (n);

        return no;
    }

}
