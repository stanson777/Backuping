import java.util.Scanner;


public class TestChar2 {


    public static char[][] znaki(String text){
        char[][] znaki1=new char[text.length()][8];
        for(int i=0;i<text.length();i++){
            znaki1[i][0]=text.charAt(i);
        }

        for(int i=0;i<text.length();i++){
            znaki1[i][1]= Character.isDigit(znaki1[i][0]) ? '1': '0';
            znaki1[i][2]=Character.isLetter(znaki1[i][0]) ? '1': '0';
            znaki1[i][3]=Character.isLetterOrDigit(znaki1[i][0]) ? '1':'0';
            znaki1[i][4]=Character.isLowerCase(znaki1[i][0]) ? '1':'0';
            znaki1[i][5]=Character.isSpaceChar(znaki1[i][0]) ? '1':'0';
            znaki1[i][6]=Character.isUpperCase(znaki1[i][0]) ? '1':'0';
            znaki1[i][7]=Character.isWhitespace(znaki1[i][0])? '1':'0';
        }


        return znaki1;
    }
    public static void main(String[] args){
        String lancuch1="A\\240b3&4\\040";
        String lancuch2="\bo\u0002 0+\\t";

        String lancuch3="#\\\"\\304\\\\\\344\\b\\n";


        char[][] znaki1=znaki(lancuch1);


        System.out.println(znaki1);

        for(int i=0;i<lancuch1.length();i++){
            for(int j=0;j<8;j++){
                System.out.print(znaki1[i][j]+" ");
            }
            System.out.println();
        }
        char[][] znaki2=znaki(lancuch2);

        char[][] znaki3=znaki(lancuch3);

    }
}
