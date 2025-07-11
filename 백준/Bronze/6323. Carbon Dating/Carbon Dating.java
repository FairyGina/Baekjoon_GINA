import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        int x=810,tc=0;
        while(!(s=I.readLine()).equals("0 0")){
            StringTokenizer st=new StringTokenizer(s);
            int ct=Integer.parseInt(st.nextToken());
            double xt=Double.parseDouble(st.nextToken())/ct,res=5730*(Math.log(xt/x)/Math.log(0.5));
            res=res<10000?Math.round(res*0.01)*100:Math.round(res*0.001)*1000;
            as.append(String.format("Sample #%d\nThe approximate age is %d years.\n\n",++tc,(int)res));
        }
        System.out.print(as);
    }
}