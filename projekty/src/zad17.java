import java.util.*;

public class zad17 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        double liczba=0;

        boolean valid=false;

        while(!valid){
            System.out.println("Wprowadź liczbe zmiennoprzecinkowa");

            String inputStr=input.nextLine();


            try{
                liczba=Double.parseDouble(inputStr);
                valid=true;
            }catch(NumberFormatException e){
                System.out.println("Wprowadź ponownie ta liczbe");

            }
        }

        System.out.println("Wprowadzona liczba to: "+liczba);
    }
}
