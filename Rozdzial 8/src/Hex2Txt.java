import java.util.Scanner;


public class Hex2Txt {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);



        String tekst=input.nextLine();

        String wynik="";

        for(int i=0;i<tekst.length();i+=2){
            String hexPair=tekst.substring(i,i+2);
            int decimalValue=Integer.parseInt(hexPair,16);
            char ascii_character=(char) decimalValue;
            wynik=wynik+ascii_character;
        }

        System.out.println(wynik);

    }
}
