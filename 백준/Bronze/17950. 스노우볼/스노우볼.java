import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int h=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken()),lm=(int)1e9+7;
        long i=1,res=0;

        while(h-->0){
            int tp=Integer.parseInt(I.readLine());
            i=i*x%lm;
            res=(tp*i%lm+res)%lm;
        }
        System.out.print(res);
    }
}