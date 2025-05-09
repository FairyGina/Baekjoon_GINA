import java.io.*;
import java.util.*;
class Main{
    static int n,d=0;
    static long w,ct=0;
    static int[] coin;
    static void buy(){
        int mn=coin[d];
        while(++d<n){
            int tc=coin[d];
            if(mn<tc){
                ct=w/mn;
                w%=mn;
                break;
            }
            mn=tc;
        }
        if(d<n) sell();
    }
    static void sell(){
        int mx=coin[d];
        while(++d<n){
            int tc=coin[d];
            if(mx>tc){
                w+=ct*mx;
                ct=0;
                break;
            }
            mx=tc;
        }
        if(d<n-1) buy();
        else w+=ct*mx;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); w=Integer.parseInt(st.nextToken());
        coin=new int[n];
        
        for(int i=0;i<n;i++){
            coin[i]=Integer.parseInt(I.readLine());
        }
        
        buy();
        System.out.println(w);
    }
}