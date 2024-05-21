public class PrawaLogiczne {
    public static void main(String[] args){
        boolean[][] prawaLogiczne=new boolean[4][];

        for(int i=0;i<4;i++){
            prawaLogiczne[i]=new boolean[2];
            prawaLogiczne[i][0]=(i%2==0);
            prawaLogiczne[i][1]=(i>=2);
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<prawaLogiczne[i].length;j++){
                System.out.print(prawaLogiczne[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
