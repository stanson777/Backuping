package model;

public class InvoicePosition {



    public final static double TAX_5=0.05;

    public final static double TAX_8=0.08;

    public final static double TAX_23=0.05;

    private Product product;

    private int count;

    private double tax;



    public void setProduct(Product product){
        this.product=product;
    }
    public Product getProduct(){
        return product;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int getCount(){
        return count;
    }

    public double getTax(){
        return tax;
    }

    public void setTax(double tax){
        this.tax=tax;
    }
}
