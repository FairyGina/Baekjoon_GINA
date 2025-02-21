import java.io.*;
import java.util.*;
class Main{
    static int n,m,sn,sm;
    static boolean[][] donut; 
    static Deque<Integer> q=new ArrayDeque<>();
    static int[] ax={-1,1,0,0},ay={0,0,-1,1};
    public static void bfs(){
        while(!q.isEmpty()){
            int x=q.poll(),y=q.poll(); 
            for(int i=0;i<4;i++){
                int tx=x+ax[i],ty=y+ay[i]; 
                if(tx<0) tx+=n; else if(tx>sn)tx-=n; 
                if(ty<0) ty+=m; else if(ty>sm)ty-=m;
                if(!donut[tx][ty]){
                    donut[tx][ty]=true; 
                    q.offer(tx);
                    q.offer(ty);
                }
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        n=Integer.parseInt(s.nextToken()); m=Integer.parseInt(s.nextToken()); 
        sn=n-1; sm=m-1;
        donut=new boolean[n][m];
        for(int i=0;i<n;i++){ 
            s=new StringTokenizer(I.readLine());
            for(int j=0;j<m;j++){
                if("1".equals(s.nextToken())) donut[i][j]=true;
            }
        }
        int a=0; 
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                if(!donut[i][j]){
                    q.offer(i); q.offer(j); 
                    bfs();
                    a++;
                }
            }
        }
        O.write(a+"\n");
        O.flush();
    }
}