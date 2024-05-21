public class OperatoryLogiczne {


    public static void main(String[] args) {
        boolean[][] operatory = new boolean[4][6];

        boolean[] operators = new boolean[2];

        operators[0] = true;
        operators[1] = false;

        String[] dodatek={"a","b","-a","-b","a||b","a&b"};

        for (int i = 0; i < 4; i++) {
            operatory[i][0] = (i % 2 == 0);
            operatory[i][1] = (i >= 2);


        }
        for(int i=0;i<4;i++){
            for(int j=2;j<6;j++){
                if(j==2){
                    operatory[i][j]=!operatory[i][0];
                }else if(j==3){
                    operatory[i][j]=!operatory[i][1];

                }else if(j==4){
                    operatory[i][j]=operatory[i][0]||operatory[i][1];
                }else if(j==5){
                    operatory[i][j]=operatory[i][0]&&operatory[i][1];
                }
            }
        }

        for(boolean[] operator:operatory){
            for(boolean value:operator){
                System.out.print(value+"\t");
            }
            System.out.println();
        }
        for(String tekst:dodatek){
            System.out.print(tekst+ "   \t");
        }
    }




}
