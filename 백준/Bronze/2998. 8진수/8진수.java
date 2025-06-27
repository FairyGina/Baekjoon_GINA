import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder(),sb=new StringBuilder(I.readLine());
        int lt;
        while((lt=sb.length())%3!=0) sb.insert(0,'0');
        for(int i=0;i<lt;i+=3){
            int d=Integer.parseInt(sb.substring(i,i+3),2);
            as.append(Integer.toOctalString(d));
        }
        System.out.print(as);
    }
}