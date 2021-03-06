public class SumTargetExpression {
    static void check(double sum, double previous, String digits, double target, String expr) {

        if (digits.length() == 0) {
            if (sum + previous == target) {
                System.out.println(expr + " = " + target);
            }
        }
        else {
            for (int i = 1; i <= digits.length(); i++) {
                double current = Double.parseDouble(digits.substring(0, i));
                String remaining = digits.substring(i);
                check(sum + previous, current, remaining, target, expr + " + " + current);
                check(sum, previous * current, remaining, target, expr + " * " + current);
                check(sum, previous / current, remaining, target, expr + " / " + current);
                check(sum + previous, -current, remaining, target, expr + " - " + current);
            }
        }
    }

    static void f(String digits, double target) {
        for (int i = 1; i <= digits.length(); i++) {
            String current = digits.substring(0, i);
            check(0, Double.parseDouble(current), digits.substring(i), target, current);
        }
    }

    public static void main(String[] args) {
        String digit="102";
        int target =5;
        SumTargetExpression.f(digit,target);
    }
}
