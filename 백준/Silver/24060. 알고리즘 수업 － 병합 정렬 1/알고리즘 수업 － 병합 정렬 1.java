import java.io.*;
import java.util.*;
class Main{
    static int[] arr;
    static int k,p=-1;
    static void mg_st(int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mg_st(l,m);
            mg_st(m+1,r);
            mg(l,m,r);
        }
    }
    static void mg(int l,int m, int r){
        if(p>-1) return;
        int i=l,j=m+1,t=0,sz=r-l+1;
        int[] tp=new int[sz];
        while(i<=m&&j<=r){
            if(arr[i]<=arr[j]){
                tp[t++]=arr[i++];
            }else tp[t++]=arr[j++];
        }
        while(i<=m) tp[t++]=arr[i++];
        while(j<=r) tp[t++]=arr[j++];
        i=l; t=0;
        while(i<=r) arr[i++]=tp[t++];

        k-=sz;
        if(k>0) return;
        int id=r+k;
        p=arr[id];
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        arr=new int[n];

        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        mg_st(0,n-1);
        System.out.println(p);
    }
}