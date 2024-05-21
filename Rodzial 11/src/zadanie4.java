import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);


        System.out.println("Podaj ciagi binarne liczb: ");

        String liczba1=input.nextLine();


        String liczba2=input.nextLine();


        int liczbaUno=Integer.parseInt(liczba1,2);


        int liczbaDos=Integer.parseInt(liczba2,2);

        String nowaLiczba=Integer.toBinaryString((liczbaUno+liczbaDos));
    }
}
