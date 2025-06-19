import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        boolean[] nb=new boolean[1001];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[Integer.parseInt(st.nextToken())]=true;
        }
        n--;
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[Integer.parseInt(st.nextToken())]=false;
        }
        for(int i=1;i<1001;i++)
            if(nb[i]){
                System.out.print(i);
                return;
            }
    }
}