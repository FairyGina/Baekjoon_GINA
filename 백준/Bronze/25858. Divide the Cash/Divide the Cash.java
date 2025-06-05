import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),num=0;
        int[] nb=new int[n];
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(I.readLine());
            num+=nb[i];
        }

        k/=num;
        for(int i=0;i<n;i++){
            as.append(nb[i]*k).append('\n');
        }

        System.out.print(as);
    }
}