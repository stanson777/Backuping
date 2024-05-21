import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Magazyn {
    HashMap<String,ArrayList<Produkt>> shelf=new HashMap<>();

    public Magazyn(){

    }

    public void add_product(Produkt product){
        String category=product.getCategory();

        if(!shelf.containsKey(category)){
            shelf.put(category,new ArrayList<>());

        };
        shelf.get(category).add(product);
    }

    public void sortByPrices(String category){
        ArrayList<Produkt> products=shelf.get(category);

        products.sort(Comparator.comparingDouble(Produkt::getPrice));
    }


    public void sortByPricesDesc(String category){
        for(int i=0;i<shelf.get(category).size()-1;i++){
            for(int j=i+1;j<shelf.get(category).size();j++){
                if(shelf.get(category).get(i).getPrice()<shelf.get(category).get(j).getPrice()){
                    Produkt temp=shelf.get(category).get(i);
                    shelf.get(category).set(i,shelf.get(category).get(j));
                    shelf.get(category).set(j,temp);
                }
            }
        }
    }
    public void sortByName(String category){
        ArrayList<Produkt> products=shelf.get(category);

        products.sort(Comparator.comparing(Produkt::getName));
    }

    public HashMap<String, Produkt> getSmallestPriceForEachCategory() {
        HashMap<String, Produkt> products = new HashMap<>();

        for (String key : shelf.keySet()) {
            sortByPrices(key);
            ArrayList<Produkt> productList = shelf.get(key);
            if (productList != null && !productList.isEmpty()) {
                Produkt item = productList.get(0);
                products.put(key, item);
            }
        }
        return products;
    }

    public HashMap<String,Produkt> biggestPriceAtEachCategory(){
        HashMap<String,Produkt> produkty=new HashMap<>();

        for (String key : shelf.keySet()) {
            sortByPrices(key);
            ArrayList<Produkt> productList = shelf.get(key);
            if (productList != null && !productList.isEmpty()) {
                Produkt item = productList.get(productList.size()-1);
                produkty.put(item.getName(), item);
            }
        }
        return produkty;
    }

    public Produkt smallestPriceWhole(){
        ArrayList<String> keysList=new ArrayList<>(getSmallestPriceForEachCategory().keySet());
        Produkt cheapestProduct=getSmallestPriceForEachCategory().get(keysList.get(0));
        for(String category:keysList){
            if(getSmallestPriceForEachCategory().get(category).getPrice()< cheapestProduct.getPrice()){
                cheapestProduct=getSmallestPriceForEachCategory().get(category);
            }
        }

        return cheapestProduct;
    }



    public void deletingItem(Produkt produkt){
        String category=produkt.getCategory();

        ArrayList<Produkt> productList=shelf.get(category);
        if(productList!=null){
            productList.remove(produkt);
        }
    }


    public boolean isItemAvailable(Produkt produkt){
        for(String key:shelf.keySet()){
            for(Produkt product:shelf.get(key)){
                if(product.equals(produkt)){
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Produkt> allProducts(){
        ArrayList<Produkt> produkty=new ArrayList<>();
        for(String category:shelf.keySet()){
            ArrayList<Produkt> ProductList=shelf.get(category);
            for(Produkt element:ProductList){
                produkty.add(element);
            }
        }

        return produkty;
    }
    public ArrayList<Produkt> allProductsSorted() {
        ArrayList<Produkt> allProducts = new ArrayList<>();
        for (ArrayList<Produkt> productList : shelf.values()) {
            allProducts.addAll(productList);
        }
        allProducts.sort(Comparator.comparingDouble(Produkt::getPrice));
        return allProducts;
    }
    /*public ArrayList<Produkt> expensiveNth(int n){
        ArrayList<Produkt> mostExpensive=new ArrayList<>();

        allProductsSorted();
        for(int i=sortedProducts.size()-1;i>=sortedProducts.size()-n;i--){
            mostExpensive.add(sortedProducts.get(i));
        }


        return mostExpensive;
    }*/


    /*public ArrayList<Produkt> cheapestNth(int n){
        ArrayList<Produkt> lessExpensive=new ArrayList<>();

        ArrayList<Produkt> sortedProducts=allProductsSorted();
        for(int i=0;i<n;i++){
            lessExpensive.add(sortedProducts.get(i));
        }


        return lessExpensive;
    }
    */

    public double totalInventoryValue(){
        double value=0.0;

        ArrayList<Produkt> allProducts=this.allProducts();

        for(Produkt product:allProducts){
            value+=product.getPrice()* product.quantity;
        }


        return value;
    }


}
