import model.Product;
import model.InvoicePosition;
public class Main {





    public static void main(String[] args) {



        System.out.println("Stawka VAT: "+InvoicePosition.TAX_5);
        System.out.println("Stawka VAT: "+InvoicePosition.TAX_8);
        System.out.println("Stawka VAT: "+InvoicePosition.TAX_23);

        Product product=new Product("ABC123","Tv",1200);

        System.out.println("Code: "+product.getCode());
        System.out.println("Name: "+product.getName());
        System.out.println("Price: "+product.getPrice());




    }
}