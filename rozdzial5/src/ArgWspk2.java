public class ArgWspk2 {
    public static void main(String[] args){
        for(int i=0;i<=args.length-1;i++){
            String argument="";
            for(int j=args[i].length()-1;j>=0;j--){
                argument+=args[i].charAt(j);
            }
            System.out.print(argument+" ");
        }
    }
}
