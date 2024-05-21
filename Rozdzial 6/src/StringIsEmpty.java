import java.util.Scanner;



public class StringIsEmpty {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);



        String sentence=input.nextLine();

        for(int i=0;i<sentence.length();i++){


            System.out.println(sentence+" iteracja: "+(i+1));
            System.out.println(sentence.length());
            System.out.println(sentence.isEmpty());
            sentence=sentence.substring(0,sentence.length()-1);

        }
    }
}
