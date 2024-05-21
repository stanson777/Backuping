import java.util.Scanner;


public class Txt2Hex {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Podaj tekst");


        String tekst=input.nextLine();

        byte[] ciag_znakow=tekst.getBytes();


        String wynik="";
        for(byte znak:ciag_znakow){
            wynik=wynik+Integer.toHexString(znak)+" ";
        }


        System.out.println(wynik);
    }
}
