public class Zamiana2 {
    public static void main(String args[]){
        if(args.length >2){
            System.out.println("Podaj dwie liczby jako argumenty: podstawe systemu liczbowego i liczby zapisanej w tym systemie");
        }




        try{
            int podstawa_systemowa=Integer.parseInt(args[0]);



            String liczbaWSystemie=Integer.toString(Integer.parseInt(args[0],podstawa_systemowa),10);

            System.out.println(args[1] + "[" + podstawa_systemowa + "] =" + liczbaWSystemie + "[10]");
        } catch (NumberFormatException e) {
            System.out.println("Podane argumenty nie są poprawnymi liczbami całkowitymi.");
        }



    }
}
