import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken()),max=-1;
        while(n-->0){
            st=new StringTokenizer(I.readLine());
            int s=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
            if((s+t)<=x){
                if(s>max) max=s;
            }
        }
        System.out.print(max);
    }
}