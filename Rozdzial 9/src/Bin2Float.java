public class Bin2Float {







    public static void main(String[] args){
        int bits=0b111110000011110000111000110010;
        float floatValue=Float.intBitsToFloat(bits);

        System.out.println(floatValue);
    }


}

