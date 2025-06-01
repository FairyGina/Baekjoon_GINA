import java.io.*;
import java.util.*;
class Main{
    static int rv(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        int id=-1,len=s.length();
        while(id<len){
            if(sb.charAt(++id)!='0') break;
        }
        return Integer.parseInt(sb.substring(id,len));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        System.out.print(rv(String.valueOf(rv(st.nextToken())+rv(st.nextToken()))));
    }
}