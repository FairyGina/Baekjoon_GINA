import java.io.*;
import java.util.*;
class Main{
    public static int bs(int a[],int s){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]>s){
                if(a[m-1]<=s) return m;
                else r=m-1;
            }
            else l=m+1;
        }
        return -1;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer S=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(S.nextToken()),q=Integer.parseInt(S.nextToken()); //n: 농장 갯수 q: 출력 q번
        int[] c=new int[n],t=new int[n],a=new int[n];
        S=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) c[i]=Integer.parseInt(S.nextToken());
        S=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) t[i]=Integer.parseInt(S.nextToken());
        for(int i=0;i<n;i++) a[i]=c[i]-t[i];
        Arrays.sort(a);
        for(int i=0;i<q;i++){
            S=new StringTokenizer(I.readLine());
            int v=Integer.parseInt(S.nextToken()),s=Integer.parseInt(S.nextToken());
            int d=bs(a,s);
            O.write(((d<0||n-d<v)?"NO":"YES")+"\n");
        }
        O.flush();
    }
}