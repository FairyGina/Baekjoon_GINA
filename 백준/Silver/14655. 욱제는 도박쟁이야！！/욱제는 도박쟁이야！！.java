import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int num=0;
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(st.nextToken());
            if(a<0) num-=a;
            else num+=a;
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(st.nextToken());
            if(a<0) num-=a;
            else num+=a;
        }
        System.out.print(num);
    }
}