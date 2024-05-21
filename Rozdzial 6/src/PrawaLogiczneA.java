public class PrawaLogiczneA {
    public static void main(String[] args){
        boolean[][] prawaLogiczne=new boolean[2][3];

        for(int i=0;i<2;i++){
            prawaLogiczne[i][0]=(i%2==0);

        }
        boolean[][] copyPrawaLogiczne=prawaLogiczne;
        int incr=0;
        for(boolean element[]:copyPrawaLogiczne){

            prawaLogiczne[incr][1]=!element[0];
            prawaLogiczne[incr][2]=(!element[0] || element[0]);
            incr++;
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(prawaLogiczne[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
