import java.util.Scanner;

public class GrandChild {
    static Scanner input= new Scanner(System.in);
    static String[][] parent = {{"luke", "shaw"},
                                {"wayne", "rooney"},
                                {"rooney","ronaldo"},
                                {"shaw","rooney"}};
    static int size = parent.length;
    static String gFather = "rooney";
    static String son;
    static int count = 0;
    static String[] father = new String[size] ;

    public static void main(String[] args) {

      //  System.out.println("Array Element Size");
        for (int i = 0; i < size; i++) {
            int columnSize = parent[i].length;
            for (int j = 0; j < columnSize; j++) {
                if (j == 1) {
                    father[i] = parent[i][j];
                    if (father[i].equals(gFather)){
                        son = parent[i][j-1];
                    }
                }
            }  System.out.println();
        }
        //count calculate
        for (String fstr :father) {
            if(fstr.equals(son)) {
                System.out.println(fstr);
                count++;
            }
        }
        System.out.println(count);
    }
}
