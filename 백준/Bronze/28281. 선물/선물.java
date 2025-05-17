import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        int[] sock=new int[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) sock[i]=Integer.parseInt(st.nextToken());
        int min=(sock[0]+sock[1])*k;
        for(int i=2;i<n;i++){
            int t=(sock[i-1]+sock[i])*k;
            if(t<min) min=t;
        }
        System.out.println(min);
    }
}