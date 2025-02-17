import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] xpa={-2,-1,1,2,-2,-1,1,2};
        int[] ypa={1,2,2,1,-1,-2,-2,-1};

        int t=Integer.parseInt(I.readLine());

        while(t-->0){
            int length=Integer.parseInt(I.readLine()),res=0;
            StringTokenizer s=new StringTokenizer(I.readLine());
            int kx=Integer.parseInt(s.nextToken()),ky=Integer.parseInt(s.nextToken());

            s=new StringTokenizer(I.readLine());
            int kmx=Integer.parseInt(s.nextToken()),kmy=Integer.parseInt(s.nextToken());

            boolean[][] v=new boolean[length][length];
            Queue<Integer> q=new LinkedList<>();
            
            q.offer(kx);
            q.offer(ky);

            length--;
            L: while(!q.isEmpty()){
                int j=q.size()/2;
                while(j-->0){
                    int x=q.poll(),y=q.poll();
                    if(((0>x||x>length)||(0>y||y>length))||v[x][y]) continue;
                    else if(x==kmx&&y==kmy){
                        O.write(res+"\n");
                        O.flush();
                        break L;
                    }
                    v[x][y]=true;
                    for(int i=0;i<8;i++){
                        q.offer(x+xpa[i]);
                        q.offer(y+ypa[i]);
                    }
                }
                res++;
            }
        }
    }
}