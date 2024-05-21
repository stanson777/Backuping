public class Suma {
    public static void main(String args[]){
        int suma=0;

        for(String arg:args){

            suma+=Integer.parseInt(arg);
        }

        System.out.println("Suma: "+suma);
    }
}
