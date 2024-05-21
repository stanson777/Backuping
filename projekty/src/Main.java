import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input=new Scanner(System.in);

        double liczba=0;
        boolean validInput=false;

        while(!validInput) {

            try {
                liczba = input.nextDouble();
                validInput=true;
                System.out.println(liczba);

            } catch (InputMismatchException e) {
                System.out.println("Wprowadź poprawna liczbe");
                input.next();
            }

        }

        System.out.println("Wprowadzona liczba: "+liczba);
    }
}