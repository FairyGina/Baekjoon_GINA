import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),as=-1,ct=0,nxt=0;
        boolean[] vt=new boolean[n];
        int[] nb=new int[n];
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(I.readLine());
        }
        while(!vt[nxt]){
            if(nxt==k){
                as=ct;
                break;
            }
            ct++;
            vt[nxt]=true;
            nxt=nb[nxt];
        }
        System.out.print(as);
    }
}