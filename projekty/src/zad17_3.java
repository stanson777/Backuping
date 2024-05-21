import java.util.*;

public class zad17_3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int suma=0;
        int count=0;

        System.out.println("Wprowadz 5 liczb calkowitych");
        while(count<5){
            if(input.hasNextInt()){
                int number=input.nextInt();
                suma+=number;
                count++;
            }else{
                System.out.println("Wprowadz liczbe calkowita");
                input.next();
            }
        }


        System.out.println("Suma= "+ suma);

    }
}
