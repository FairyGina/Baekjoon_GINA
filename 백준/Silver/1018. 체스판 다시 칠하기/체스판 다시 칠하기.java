import java.io.*;
import java.util.*;
class Main{
    static int n,m;
    static boolean[][] WB;
    public static int chess(boolean ch){
        int min=64;
        for(int r=0;r<n-7;r++){
            for(int c=0;c<m-7;c++){
                int res=0;
                for(int i=r;i<r+8;i++){
                    for(int j=c;j<c+8;j++){
                        if(ch!=WB[i][j]) res++;
                        ch=!ch;
                    }
                    ch=!ch;
                }
                if(min>res) min=res;
            }
        }
        return min;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        n=Integer.parseInt(s.nextToken());
        m=Integer.parseInt(s.nextToken());
        WB=new boolean[n][m];
        for(int i=0;i<n;i++){
            String WBs=I.readLine();
            char[] c=WBs.toCharArray();
            for(int j=0;j<m;j++)
                WB[i][j]=(c[j]=='W');
        }
        int ans1=chess(true),ans2=chess(false);
        if(ans1>ans2) ans1=ans2;
        O.write(ans1+"\n");
        O.flush();
    }
}