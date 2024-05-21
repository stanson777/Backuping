import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        int przyprostkata1=input.nextInt();

        int przyprostkata2=input.nextInt();



        double przeciwkatna=Math.pow(przyprostkata1,2)+Math.pow(przyprostkata2,2);

        System.out.println(przeciwkatna);


    }
}
