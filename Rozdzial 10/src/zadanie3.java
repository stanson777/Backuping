public class zadanie3 {


    public static void main(String[] args){
        double[] liczby={2,3,5,7,11,13,17};

        for(double liczba:liczby){
            System.out.printf("Liczba: %15.2f\t | Pierwiastek: %15.8f\t | Pierwiastek sześcienny %15.8f\t",liczba,Math.sqrt(liczba),Math.cbrt(liczba));
            System.out.println();
        }

    }
}
