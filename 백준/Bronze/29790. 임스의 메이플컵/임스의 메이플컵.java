import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),u=Integer.parseInt(st.nextToken()),l=Integer.parseInt(st.nextToken());
        String s="Bad";
        if(n>999){
            if(u>7999||l>259) s="Very Good";
            else s="Good";
        }
        System.out.print(s);
    }
}