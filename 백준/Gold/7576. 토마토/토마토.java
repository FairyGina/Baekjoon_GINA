import java.io.*;
import java.util.*;
class Main{
    static int n,m,dt=-1;
    static int[][] tomato;
    static Deque<Integer> q=new ArrayDeque<>();
    static int[] mx={-1,1,0,0},my={0,0,-1,1}; //move_x,move_y
    
    public static void bfs(){
        while(!q.isEmpty()){
            int qs=q.size()/2; //좌표 x,y 두 개 넣으니까 /2, 깊이를 세면 토마토 익는 일수를 알 수있음음
            while(qs-->0){
                int x=q.poll(),y=q.poll();
                for(int i=0;i<4;i++){
                    int tx=x+mx[i],ty=y+my[i]; //temp_x, temp_y
                    if(tx<0||ty<0||tx>n-1||ty>m-1||tomato[tx][ty]!=0) continue;
                    q.offer(tx); q.offer(ty); //좌표 큐에 추가
                    tomato[tx][ty]=1;
                }
            }
            dt++;
        }
        
    }
    public static void main(String[] agrs)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s=new StringTokenizer(I.readLine());
        m=Integer.parseInt(s.nextToken()); n=Integer.parseInt(s.nextToken());
        
        
        tomato=new int[n][m];
        for(int i=0;i<n;i++){
            s=new StringTokenizer(I.readLine());
            for(int j=0;j<m;j++){
                tomato[i][j]=Integer.parseInt(s.nextToken());
                if(tomato[i][j]==1){
                    q.offer(i); q.offer(j);
                }
            }
        }

        bfs();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(tomato[i][j]==0) dt=-1;
            }
        }

        O.write(dt+"\n");
        O.flush();
    }
}