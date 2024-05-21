import java.util.ArrayList;

public class Koszyk {



    ArrayList<Produkt> koszyk=new ArrayList<>();
    public Koszyk(){

    }

    public void addProduct(Produkt product){
        koszyk.add(product);
    }

    public double basketPrice(){
        double price=0.0;

        for(Produkt produkt:koszyk){
            price+=produkt.getPrice();
        }

        return price;
    }

    public void fifteenPromotion(){
        if(basketPrice()>=300){
            for(Produkt produkt:koszyk){
                produkt.setPrice(produkt.getPrice()*0.85);
            }
        }
    }

    public void thirdForfree(){

    }

}
