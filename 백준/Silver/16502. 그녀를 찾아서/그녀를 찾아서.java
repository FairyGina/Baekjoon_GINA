import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int ct=Integer.parseInt(I.readLine()),m=Integer.parseInt(I.readLine());
        double[] info={25,25,25,25},mk=new double[4],pc=new double[m];
        int[][] line=new int[m][2];
        for(int i=0;i<m;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            line[i][0]=st.nextToken().charAt(0)-65;
            line[i][1]=st.nextToken().charAt(0)-65;
            pc[i]=Double.parseDouble(st.nextToken());
        }
        while(ct-->0){
            Arrays.fill(mk,0);
            for(int i=0;i<m;i++){
                int a=line[i][0],b=line[i][1];
                mk[b]+=info[a]*pc[i];
            }
            System.arraycopy(mk,0,info,0,4);
        }
        System.out.print(String.format("%.2f\n%.2f\n%.2f\n%.2f\n",info[0],info[1],info[2],info[3]));
    }
}