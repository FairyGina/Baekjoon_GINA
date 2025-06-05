import java.io.*;
import java.util.*;
class Main{
    static int n,m,sh=0;
    static int[] ya={-1,0,1,0},xa={0,1,0,-1};
    static char[][] miro;
    static Deque<Integer> q=new ArrayDeque<>();
    static boolean find(){
        int dt=0;
        while(!q.isEmpty()){
            int sz=q.size()/2;
            dt++;
            while(sz-->0){
                int x=q.poll(),y=q.poll();
                for(int i=0;i<4;i++){
                    int tx=x+xa[i],ty=y+ya[i];
                    if(-1<tx&&tx<m&&-1<ty&&ty<n&&miro[ty][tx]!='X'){
                        if(miro[ty][tx]=='G'){
                            sh=dt;
                            return true;
                        }
                        q.offer(tx); q.offer(ty);
                        miro[ty][tx]='X';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());
            q.clear();
            miro=new char[n][m];
            for(int i=0;i<n;i++){
                String ts=I.readLine();
                int id=ts.indexOf('S');
                if(id>-1){
                    q.offer(id); q.offer(i); //x,y
                }
                for(int j=0;j<m;j++){
                    miro[i][j]=ts.charAt(j);
                }
            }
            if(find()){
                as.append("Shortest Path: ").append(sh).append('\n');
            }else{
                as.append("No Exit\n");
            }
        }
        System.out.print(as);
    }
}