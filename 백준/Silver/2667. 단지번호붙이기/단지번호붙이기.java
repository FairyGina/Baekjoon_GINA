import java.io.*;
import java.util.*;
class Main{
    static boolean[][] vt;
    static int[] ya={1,0,0,-1},xa={0,1,-1,0};
    static int n,hct;
    static void dfs(int y,int x){
        vt[y][x]=false;
        hct++;
        for(int i=0;i<4;i++){
            int ty=y+ya[i],tx=x+xa[i];
            if(ty>=n||ty<0||tx>=n||tx<0||!vt[ty][tx]) continue;
            dfs(ty,tx);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        n=Integer.parseInt(I.readLine());
        int ct=0;
        vt=new boolean[n][n];
        for(int i=0;i<n;i++){
            String s=I.readLine();
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='1') vt[i][j]=true;
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(vt[i][j]){
                    hct=0;
                    dfs(i,j);
                    a.add(hct);
                    ct++;
                }
            }
        }
        Collections.sort(a);
        for(int i:a) as.append(i).append('\n');
        System.out.print(ct+"\n"+as);
    }
}