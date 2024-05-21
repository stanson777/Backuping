public class Xor {
    public static void main(String[] args){
        boolean[][] tabela_xor=new boolean[4][3];


        for(int i=0;i<4;i++){
            tabela_xor[i][0]=(i%2==0);
            tabela_xor[i][1]=(i>=2);
        }


        for(int j=0;j<4;j++){
            tabela_xor[j][2]=tabela_xor[j][0]!=tabela_xor[j][1];
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(tabela_xor[i][j]+" ");
            }
            System.out.println();
        }

    }

}
