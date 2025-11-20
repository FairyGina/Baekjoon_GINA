import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(I.readLine());
        StringBuilder ans=new StringBuilder();
        for(int ii=0;ii<t;ii++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
            if(y<0){
                y=-y;
                x=-x;
            }
            if(x>0) y+=x;
            else if(x<-y) y+=x-y;
            ans.append(Math.abs(y)).append('\n');
        }
        System.out.print(ans);
    }
}