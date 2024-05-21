public class MaxPositive {


    public static String hex_changer(Number value){
        if(value instanceof Long){
            long longValueMin=Long.MIN_VALUE;
            long longValueMax=Long.MAX_VALUE;
            return "Long <"+Long.toHexString(longValueMin)+","+Long.toHexString(longValueMax)+">";
        }else if(value instanceof Integer){
            int intValueMin=Integer.MIN_VALUE;
            int intValueMax=Integer.MAX_VALUE;
            return "Integer <"+Long.toHexString(intValueMin)+","+Long.toHexString(intValueMax)+">";
        }else if(value instanceof Short){
            short shortMin=Short.MIN_VALUE;
            short shortMax=Short.MAX_VALUE;
            return "Short <"+Integer.toHexString(shortMin)+","+Long.toHexString(shortMax)+">";
        }else if(value instanceof Byte){
            byte byteMin=Byte.MIN_VALUE;
            byte byteMax=Byte.MAX_VALUE;

            return "Byte <"+Integer.toHexString(byteMin)+","+Long.toHexString(byteMax)+">";
        }
        return "Unsupported numeric type";
    }
    public static String binary_changer(Number value){
        if(value instanceof Long){
            long longValueMin=Long.MIN_VALUE;
            long longValueMax=Long.MAX_VALUE;
            return "Long <"+Long.toBinaryString(longValueMin)+","+Long.toBinaryString(longValueMax)+">";
        }else if(value instanceof Integer){
            int intValueMin=Integer.MIN_VALUE;
            int intValueMax=Integer.MAX_VALUE;
            return "Integer <"+Long.toBinaryString(intValueMin)+","+Long.toBinaryString(intValueMax)+">";
        }else if(value instanceof Short){
            short shortMin=Short.MIN_VALUE;
            short shortMax=Short.MAX_VALUE;
            return "Short <"+Integer.toBinaryString(shortMin)+","+Long.toBinaryString(shortMax)+">";
        }else if(value instanceof Byte){
            byte byteMin=Byte.MIN_VALUE;
            byte byteMax=Byte.MAX_VALUE;

            return "Byte <"+Integer.toBinaryString(byteMin)+","+Long.toBinaryString(byteMax)+">";
        }
        return "Unsupported numeric type";
    }
    public static void main(String[] args){
        Object[] data=new Object[4];


        long longValue = 123456789012345L;
        int intValue = 987654321;
        short shortValue = 32767;
        byte byteValue = 127;

        data[0] = longValue;
        data[1] = intValue;
        data[2] = shortValue;
        data[3] = byteValue;


        for (Object value : data) {
            System.out.println(hex_changer((Number) value));
        }

        for (Object value: data){
            System.out.println(binary_changer((Number) value));
        }
    }
}
//Zmienic i dokonczyc