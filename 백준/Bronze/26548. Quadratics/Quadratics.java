import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            double a=Double.parseDouble(st.nextToken()),b=Double.parseDouble(st.nextToken()),c=Double.parseDouble(st.nextToken());
            double res=((Math.sqrt(Math.pow(b,2)-4*a*c)-b))/(2*a);
            as.append(String.format("%.3f, ",res));
            res=(-(Math.sqrt(Math.pow(b,2)-4*a*c)+b))/(2*a);
            as.append(String.format("%.3f\n",res));
        }
        System.out.println(as);
    }
}