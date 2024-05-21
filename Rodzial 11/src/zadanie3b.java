import java.util.Scanner;

public class zadanie3b {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        int przyprostokatna=input.nextInt();


        int stopniePrzykacie=input.nextInt();



        double przeciwprostokatna=przyprostokatna/Math.sin(Math.toRadians(stopniePrzykacie));

        System.out.println(przeciwprostokatna);
    }
}
