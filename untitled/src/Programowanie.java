public class Programowanie {

    static char[] toUpperCase(String word){
        char[] slowo=new char[word.length()];
        for(int i=0;i<word.length();i++){
            if(i==0){
                slowo[i]=Character.toUpperCase(word.charAt(i));
            }else{
                slowo[i]=word.charAt(i);
            }
        }

        return slowo;
    }

    static char[] first_toUpperCase(String word){
        char[] slowo=new char[word.length()];
        for(int i=0;i<word.length();i++){
            if(i!=0){
                slowo[i]=Character.toUpperCase(word.charAt(i));
            }else{
                slowo[i]=word.charAt(i);
            }
        }

        return slowo;
    };
    static char[] reversed_word(String word){
        char[] slowo=new char[word.length()];
        int inc=0;
        for(int i=word.length()-1;i>=0;--i){

            slowo[inc]=word.charAt(i);
            inc++;
        }

        return slowo;
    }

    static void reverseWord2(char[] word){
        int length=word.length;
        for(int i=0;i<length/2;i++){ o
            char temp=word[i];
            word[i]=word[length-1-i];
            word[length-1-i]=temp;
        }
    }
    public static void main(String[] args){

        String word="programowanie";

        char[] slowo1=toUpperCase(word);

        char[] slowo2=first_toUpperCase(word);


        char[] odwrocone_slowo=reversed_word(word);
        for(char znak:slowo1) {
            System.out.print(znak+" ");
        }

        System.out.println(" ");
        for(char znak:slowo2) {
            System.out.print(znak+" ");
        }
        System.out.println(" ");
        System.out.println("Odwrocone slowo");
        for(char znak:odwrocone_slowo){
            System.out.print(znak+"");
        }

        System.out.println(" ");
        reverseWord2(odwrocone_slowo);
        System.out.println(odwrocone_slowo);
    }
}
