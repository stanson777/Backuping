public class zadanie5 {


    public static void main(String[] args){
        char[] tabela=new char[26];



        int incr=0;
        for(int i=65;i<91;i++){

            char znak=(char)i;
            String osemkowy=Integer.toOctalString(i);
            String szesnastkowy=Integer.toHexString(i);


            String formattedString=String.format("Znak : %c | \t OCT: %s | \t HEX: %s | \t DEC: %d",znak,osemkowy, szesnastkowy,i);
            System.out.println(formattedString);
        }


    }
}
