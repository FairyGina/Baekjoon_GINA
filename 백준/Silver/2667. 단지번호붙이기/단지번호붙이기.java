import java.io.*;
import java.util.*;
class Main{
    static boolean[][] vt;
    static int[] ya={1,0,0,-1},xa={0,1,-1,0};
    static int n;
    static int bfs(int y,int x){
        int ct=1;
        vt[y][x]=false;
        Deque<Integer> q=new ArrayDeque<>();
        q.offer(y); q.offer(x);
        while(!q.isEmpty()){
            y=q.poll(); x=q.poll();
            for(int i=0;i<4;i++){
                int ty=y+ya[i],tx=x+xa[i];
                if(ty>=n||ty<0||tx>=n||tx<0||!vt[ty][tx]) continue;
                vt[ty][tx]=false;
                ct++;
                q.offer(ty);
                q.offer(tx);
            }
        }
        return ct;
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
                    a.add(bfs(i,j));
                    ct++;
                }
            }
        }
        Collections.sort(a);
        for(int i:a) as.append(i).append('\n');
        System.out.print(ct+"\n"+as);
    }
}