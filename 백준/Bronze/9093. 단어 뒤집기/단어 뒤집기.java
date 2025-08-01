import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int ti=Integer.parseInt(I.readLine());
        while(ti-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            while(st.hasMoreTokens()){
                as.append(new StringBuilder(st.nextToken()).reverse().toString());
                as.append(' ');
            }
            as.append('\n');
        }
        System.out.print(as);
    }
}