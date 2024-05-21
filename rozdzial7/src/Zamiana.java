public class Zamiana {
    public static void main(String args[]){

        if (args.length < 2) {
            System.out.println("Podaj dwie liczby jako argumenty: podstawę systemu liczbowego i liczbę dziesiętną.");
            return;
        }
        int system_liczbowy=Integer.parseInt(args[0]);
        int liczba=Integer.parseInt(args[1]);


        String x=Integer.toString(liczba,system_liczbowy);

        System.out.println(liczba+"[10] ="+x+"["+system_liczbowy+"]");
    }
}
