public class MinMax {
    public static void main(String[] args){
        Object[] dataArray=new Object[4];


        dataArray[0]="Byte <"+Byte.MIN_VALUE +","+ Byte.MAX_VALUE+">";
        dataArray[1]="Short <"+Short.MIN_VALUE+","+Short.MAX_VALUE+">";
        dataArray[2]="Int <"+Integer.MIN_VALUE+","+Integer.MAX_VALUE+">";

        dataArray[3]="Long <"+Long.MIN_VALUE+","+Long.MAX_VALUE+">";


        for(Object value:dataArray){
            System.out.println(value);
        }



    }
}
