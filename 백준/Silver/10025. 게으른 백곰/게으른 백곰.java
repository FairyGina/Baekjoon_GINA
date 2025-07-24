import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),s=0,lm=(int)(1e6)+1,mxi=0,mni=lm;
        int[] nb=new int[lm];
        k*=2;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            int g=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
            s+=g;
            nb[x]=g;
            if(mxi<x) mxi=x;
            if(mni>x) mni=x;
        }
        n=-1;
        int num=0;
        if(mni+k<lm){
            n=mni+k+1;
            for(int i=mni;i<n;i++){
                num+=nb[i];
            }
            n=num;
        }
        for(int i=mni+k+1;i<=mxi;i++){
            num=num-nb[i-k-1]+nb[i];
            if(num>n) n=num;
        }
        System.out.print(n<0?s:n);
    }
}