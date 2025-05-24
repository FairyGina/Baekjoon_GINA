import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        boolean[] row=new boolean[9],col=new boolean[9];
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int ti=Integer.parseInt(st.nextToken());
            String ans="SAFE";

            Arrays.fill(row,false);
            Arrays.fill(col,false);
            for(int j=0;j<ti;j++){
                int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
                if(row[x]||col[y]) ans="NOT SAFE";
                row[x]|=col[y]=true;
            }

            as.append(ans).append('\n');
        }
        System.out.print(as);
    }
}