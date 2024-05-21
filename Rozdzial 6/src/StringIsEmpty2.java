public class StringIsEmpty2 {
    public static void main(String[] args){
        String pusty_ciag="";
        System.out.println("Czy ciag jest pusty?"+pusty_ciag.isEmpty());

        String ciagZPojedynczymZnakiem="A";
        System.out.println("Czy ciag z jedynym znakiem jest pusty?"+ciagZPojedynczymZnakiem.isEmpty());


        String niePustyciag="Masno";
        System.out.println("Czy nie pusty ciag jest pusty? "+niePustyciag.isEmpty());
    }
}
