import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken());
        long max=Math.max(a,b),min=Math.min(a,b)+1;
        a=max-min;
        as.append(a<0?0:a).append('\n');
        for(long i=min;i<max;i++){
            as.append(i).append(' ');
        }
        System.out.print(as);
    }
}