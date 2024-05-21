
import static java.lang.System.*;
public class demoCharacter {
    public static void main(String[] args){
        out.println("Klasa: java.lang.Character");
        out.println("Metoda statyczna: digit\n");
        out.println("static int digit(int ch, int radix)");
        out.println("Returns the numeric value of the character ch in the specified radix.");


        char[] tablicaZnakow=new char[10];

        for(int i=0;i<=tablicaZnakow.length-1;i++){
            tablicaZnakow[i]=(char)(i+'A');
        }
        System.out.println("Zawartosc tablicy znakow");
        for(char znak:tablicaZnakow){
            System.out.print(znak+" ");
        }

        char[] tablicaZnakow2 ={'A','B','C','D','E','F','G','H','I','J'};

        for(int i=0;i<=tablicaZnakow2.length-1;i++){
            tablicaZnakow2[i]=Character.forDigit(i,16);
        }
        System.out.println("   ");
        for(int znak:tablicaZnakow2){
            System.out.print(znak+" ");
        }
    }
}
