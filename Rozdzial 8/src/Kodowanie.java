import java.util.Scanner;


public class Kodowanie {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        String tekst=input.nextLine();

        /*for(int i=0;i<tekst.length();i++){
            byte type;

            char x=tekst.charAt(i);

            type=
        }*/
        byte[] ciag=tekst.getBytes();

        for(byte element:ciag){
            System.out.println(element);
        }

    }
}
