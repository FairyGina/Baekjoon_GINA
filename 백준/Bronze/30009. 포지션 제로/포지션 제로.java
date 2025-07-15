import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int q=0,w=0;
        int t=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken()),r=Integer.parseInt(st.nextToken()),r1=x-r,r2=x+r;
        while(t-->0){
            int tn=Integer.parseInt(I.readLine());
            if(tn==r1||tn==r2) w++;
            else if(tn>r1&&tn<r2) q++;
        }
        System.out.print(q+" "+w);
    }
}