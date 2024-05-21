import java.util.Scanner;


public class DodajCyfry {
    public static void main(String[] args){
        System.out.println("Wprowadz liczbe w postaci tekstu");

        Scanner input=new Scanner(System.in);

        String tekst=input.nextLine();


        int suma=0;
        for(int i=0;i<tekst.length();i++){
            char znak=tekst.charAt(i);

            if(Character.isDigit(znak)){
                int wartosc=Character.getNumericValue(znak);
                suma+=wartosc;
            }
        }


        System.out.println(suma);
    }
}
