public class DoubleBin {
    public static void main(String[] args){
        double value=0.25;


        long value2=Double.doubleToLongBits(value);

        System.out.println(value2);


        String ciag=Long.toBinaryString(value2);

        System.out.println(ciag);
    }
}
