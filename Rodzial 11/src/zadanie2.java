import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        double fahrenheit=input.nextDouble();

        double celcjusz=(fahrenheit-32)/1.8;

        System.out.printf("%.1f",celcjusz);
    }

}
