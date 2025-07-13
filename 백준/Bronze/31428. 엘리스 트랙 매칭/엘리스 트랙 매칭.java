import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),res=0;
        StringTokenizer st=new StringTokenizer(I.readLine());
        String c=I.readLine();
        for(int i=0;i<n;i++){
            if(c.equals(st.nextToken())) res++;
        }
        System.out.print(res);
    }
}