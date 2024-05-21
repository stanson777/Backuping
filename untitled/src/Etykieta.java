import java.lang.Character;

public class Etykieta {
    public static void main(String[] args){
        char[] tablica= new char[20];
        String napis="Dzien dobry java!";
        for(int i=0;i<=napis.length()-1;i++){
           // tablica[i]=napis.charAt(i));
        }


        System.out.println("Pionowo");
        String napis2="Informatyka";
        char[] infa_tablica=new char[napis2.length()];

        for(int i=0;i<=napis2.length()-1;i++){
            infa_tablica[i]=napis2.charAt(i);
        }

        for(char znak:infa_tablica){
            System.out.println(Character.toUpperCase(znak));
        }

        System.out.println("_____________________");
        System.out.println("Poziomo");
        for(char znak:infa_tablica){
            System.out.print(Character.toUpperCase(znak)+" ");
        }

       System.out.println(" ");
        System.out.println("Pionowo");


        for(char znak:infa_tablica){
            System.out.println(Character.toLowerCase(znak));
        }

        System.out.println("_____________________");
        System.out.println("Poziomo");
        for(char znak:infa_tablica){
            System.out.print(Character.toLowerCase(znak)+" ");
        }
    }
}
