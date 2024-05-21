import java.util.Objects;

public class Produkt {

    String code;
    private double price;

    String name;

    int quantity;
    public Produkt(String code,String name,double price,int quantity){
        this.code=code;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public String getCode(){
        return code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(String code){
        this.code=code;
    }


    public String getCategory(){
        char[] checker = new char[3];
        for (int i = 0; i < 3; i++) {
            checker[i] = code.charAt(i);
        }

        String word = "";

        for (char znak : checker) {
            word += znak;
        }
        if (word.equals("COM")) {
            return "Computers";
        } else if (word.equals("TEL")) {
            return "TVs";
        } else if (word.equals("AGD")) {
            return "AGDs";
        } else if (word.equals("RTV")) {
            return "RTVs";
        } else if (word.equals("OTH")) {
            return "Other";
        } else {
            return "Random";
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produkt other = (Produkt) obj;
        return Double.compare(other.price, price) == 0 &&
                Objects.equals(code, other.code) &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price);
    }
}
