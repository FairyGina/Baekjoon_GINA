import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        int[] nb=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }
        System.out.print(n%2==0?"Alice":"Bob");
    }
}