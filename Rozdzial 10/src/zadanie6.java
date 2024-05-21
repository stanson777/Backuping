import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        double radiany=input.nextDouble();


        double stopnie=Math.toDegrees(radiany);


        double minuty=(stopnie-(int)stopnie)*60;

        double sekundy=(minuty-(int) minuty)*60;

        System.out.printf("Radiany: %.2f  Stopnie: %.2f  Minuty: %.2f  Sekundy: %.2f %n",radiany,stopnie,minuty,sekundy);
        System.out.printf("Miara kąta w stopniach i minutach kątowych: %d°%.0f'",(int)stopnie,minuty);
        System.out.printf("Miara kąta w stopniach, minutach i sekundach katowych: %d°%.0f'%.0f''",(int)stopnie,minuty,sekundy);
    }
}
