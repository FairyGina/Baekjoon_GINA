import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        
        int n=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        while(n-->0){
            as.append(st.nextToken()).append("DORO ");
        }
        System.out.print(as);
    }
}