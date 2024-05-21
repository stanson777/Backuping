//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
        for(int i=0;i<=5;i++){
            if(i==0||i==5){
                for(int j=0;j<=5;j++){
                    System.out.print("*");
                }
            }else{
                System.out.println("*     *");
            }

        }
    }
}