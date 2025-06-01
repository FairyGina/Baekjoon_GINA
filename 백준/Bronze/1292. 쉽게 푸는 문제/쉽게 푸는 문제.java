import java.io.*;
import java.util.*;
class Main{
    static long sum(int n){
        int i=1,ct=0,res=0;
        while(true){
            ct+=i;
            if(ct>n) break;
            res+=i*i;
            i++;
        }
        return res+i*(n-ct+i);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        System.out.print(-sum(Integer.parseInt(st.nextToken())-1)+sum(Integer.parseInt(st.nextToken())));
    }
}