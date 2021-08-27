import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLOutput;

public class TwoDimensional {


    public static void main(String[] args) throws IOException {
//        InputStreamReader sr= new InputStreamReader(System.in);
//        BufferedReader bfr= new BufferedReader(sr);

        String sentence ="WelcomeToZohoCorporation";
        String searchString = "Too";
        int ssSize =searchString.length()-1;
        int length = sentence.length();
        int arySize = 5;
        int k = 0;

        char[][] twoDArray = new char[arySize][arySize];
            for (int i = 0; i < arySize; i++) {
                for (int j = 0; j < arySize; j++) {
                    if(k<sentence.length()) {
                        twoDArray[i][j] = sentence.charAt(k);
                        k = k + 1;
                    }
                    else{
                        twoDArray[i][j]= ' ';
                    }
                    System.out.print( twoDArray[i][j]+" ");
                }
                System.out.println();
            }
            int position=twoDArray[0].length-ssSize;

        for (int i = 0; i <= position; i++) {
            for (int j = 0; j <= position; j++) {
                char letter = twoDArray[i][j];
                k=0;
                char sLetter = searchString.charAt(k);
                if(letter == sLetter){
                    k++;
                    if(searchString.charAt(k) == twoDArray[i][j+1] && searchString.charAt(k+1)==twoDArray[i][j+2])
                    {
                        System.out.print(i+","+j+"\n");
                        System.out.print(i+","+j+2);
                    }
                    if(searchString.charAt(k) == twoDArray[i+1][j] && searchString.charAt(k+1)==twoDArray[i+2][j])
                    {
                        System.out.print(i+","+j+"\n");
                        System.out.println(i+2+","+j);
                    }
                    k=0;
                }

            }
            System.out.println();
        }


    }

}
