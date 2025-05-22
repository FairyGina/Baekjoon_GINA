import java.io.*;
class Solution{
    static int n,ct;
    static boolean[] right,left,col;
    static void queen(int dt){
        if(dt==n){
            ct++;
            return;
        }
        for(int i=0;i<n;i++){
            int rid=n-i+dt-1;
            if(!right[rid]&&!left[i+dt]&&!col[i]){
                right[rid]=true;
                left[i+dt]=true;
                col[i]=true;
                queen(dt+1);
                right[rid]=false;
                left[i+dt]=false;
                col[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            ct=0;
            n=Integer.parseInt(I.readLine());
            right=new boolean[n*2-1]; left=new boolean[n*2-1]; col=new boolean[n];
            queen(0);
            String ass=String.format("#%d %d\n",t,ct);
            as.append(ass);
        }
        System.out.println(as);
    }
}