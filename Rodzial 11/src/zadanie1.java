import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Wprowadz temperature: ");

        double celcjusz=input.nextDouble();

        double Fahrenheita=celcjusz*1.8+32;

        System.out.printf("%.1f celcjusza = %.1f fahrenheita",celcjusz,Fahrenheita);
    }
}
