import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        if(k==0||n-k==0) k=1;
        else{
            int m=n-k;
            for(int i=n-1;i>k;i--)n*=i;
            for(int i=m-1;i>0;i--)m*=i;
            k=n/m;
        }
        System.out.println(k);
    }
}