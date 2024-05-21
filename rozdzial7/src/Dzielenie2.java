public class Dzielenie2 {

    public static void dzielenie(int a,int b){
        try{
            int result=a/b;
            int modulo=a%b;
            System.out.println(a+"/"+b+"="+result+"r."+modulo);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
    }
    public static void main(String args[]){


        dzielenie(13,2);
    }
}
