import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());

        double v=Double.parseDouble(st.nextToken()),w=Double.parseDouble(st.nextToken()),d=Double.parseDouble(st.nextToken());
        int ct=-1;
        while(d>0){
            double t=w/v;
            double s=5*t*t;
            v*=0.8;
            d-=s;
            ct++;
        }
        System.out.print(ct);
    }
}