public class Pyramid {
    public static void main(String[] args) {
        drawPyramidOfNumbers();
    }
    public static void drawPyramidOfNumbers() {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
