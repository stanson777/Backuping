public class Bin2Double {
    public static void main(String[] args){


        long binValue=0b111110000011110000111000110010;


        double newValue=Double.longBitsToDouble(binValue);


        System.out.println(newValue);
    }
}
