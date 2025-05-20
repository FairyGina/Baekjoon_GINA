import java.io.*;
import java.util.*;
class Solution{
    static int[] nb;
    static int len,limit,max;
    static void swap(int i,int j){
        int t=nb[i];
        nb[i]=nb[j];
        nb[j]=t;
    }
    static void card(int ct){
        if(ct==len){
            if((limit-ct)%2!=0) swap(len-2,len-1);
            ct=limit;
        }
        if(ct==limit){
            int tr=0;
            for(int i:nb){
                tr=tr*10+i;
            }
            if(max<tr) max=tr;
            return;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                swap(i,j);
                card(ct+1);
                swap(i,j);
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            String s=st.nextToken();
            limit=Integer.parseInt(st.nextToken());
 
            len=s.length();
            nb=new int[len];
 
            max=0;
            for(int i=0;i<len;i++){
                nb[i]=s.charAt(i)-'0';
            }
            card(0);
            as.append('#').append(t).append(' ').append(max).append('\n');
        }
        System.out.print(as);
    }
}