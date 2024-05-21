import java.util.Scanner;


public class Dekodowanie {
    public static void main(String[] args){

        System.out.println("Ile znakow zawiera to slowo ?");

        Scanner input=new Scanner(System.in);
        int rozmiar=input.nextInt();


        byte[] znaki=new byte[rozmiar];
        for(int i=0;i<rozmiar;i++){

            byte znak=input.nextByte();
            znaki[i]=znak;
        }


        String result="";

        for(byte b:znaki){
            result=result+((char) b);
        }


        System.out.println(result);

    }
}
