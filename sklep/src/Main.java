import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");




        Produkt produkt1=new Produkt("COM3123","OperatoX",312553,3);
        Produkt produkt2=new Produkt("COM3523","OperatoX",31223,1);
        Produkt produkt3=new Produkt("COM37323","OperatoX",31263,1);

        Magazyn magazyn=new Magazyn();

        magazyn.add_product(produkt1);

        magazyn.add_product(produkt2);

        magazyn.add_product(produkt3);


        ArrayList<Produkt> produkty=magazyn.allProductsSorted();

        for(Produkt element:produkty){
            System.out.println(element.getCode());
        }

        System.out.println(magazyn.totalInventoryValue());
    }
}