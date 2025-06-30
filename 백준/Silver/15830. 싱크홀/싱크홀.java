import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        double v=Double.parseDouble(st.nextToken()),w=Double.parseDouble(st.nextToken()),d=Double.parseDouble(st.nextToken());
        int ct=-1;
        while(d>0){
            double s=5*w*w/(v*v);
            v=v*8/10;
            d-=s;
            ct++;
        }
        System.out.print(ct);
    }
}