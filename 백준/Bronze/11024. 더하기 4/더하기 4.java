import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int num=0;
            StringTokenizer st=new StringTokenizer(I.readLine());
            while (st.hasMoreTokens()) {
                num+=Integer.parseInt(st.nextToken());
                
            }
            as.append(num).append('\n');
        }
        System.out.print(as);
    }
}