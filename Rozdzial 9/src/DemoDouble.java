public class DemoDouble {
    public static void main(String[] args) {
        double a = Double.MIN_VALUE;
        System.out.println("Minimalna warto dodatnia: "+a);
        System.out.println("BIN: "+Long.toBinaryString(Double.
                doubleToLongBits(a)));
        System.out.println("HEX: "+Double.toHexString(a));
        a = a;
        System.out.println("Liczba przeciwna: "+a);
        System.out.println("BIN: "+Long.toBinaryString(Double.
                doubleToLongBits(a)));
        System.out.println("HEX: "+Double.toHexString(a));
    }
}