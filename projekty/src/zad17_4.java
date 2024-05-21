import java.util.*;
public class zad17_4 {
    public static double odwrotnosc(double liczba){
        try{
            return 1/liczba;
        }catch(ArithmeticException e){
            System.out.println("Dzielenie przez zero nie dziala bye,bye");
            return Double.NaN;
        }

    }
    public static void main(String[] args){


        Scanner input=new Scanner(System.in);
        boolean valid=false;


        while(!valid){


            try{
                double liczba=input.nextDouble();
                double wynik=odwrotnosc(liczba);
                System.out.println("Odwrótność liczby " + liczba + " to: " + wynik);
                valid=true;
            }catch(InputMismatchException e){
                System.out.println("Nieprawidłowy format liczby");
                input.next();
            }
        }
    }
}
