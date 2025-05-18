import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[][] num=new int[15][15];
        for(int i=1;i<15;i++){
            num[0][i]=i;
        }
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                num[i][j]=num[i][j-1]+num[i-1][j];
            }
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int k=Integer.parseInt(I.readLine()),n=Integer.parseInt(I.readLine());
            as.append(num[k][n]).append('\n');
        }
        System.out.println(as);
    }
}