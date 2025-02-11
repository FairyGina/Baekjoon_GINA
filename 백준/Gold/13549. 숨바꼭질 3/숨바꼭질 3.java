import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer e = new StringTokenizer(s.readLine());
        int n=Integer.parseInt(e.nextToken()),k=Integer.parseInt(e.nextToken()),r=0,M=100001;
        boolean[] T=new boolean[M];
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> p=new LinkedList<>();
        q.offer(n);
        p.offer(0);
        L:do{
            int z=q.size(), i=0;
            do {
                i++;
                int x=q.poll(), y=p.poll();
                if(x==k){
                    n=y;
                    break L;
                }
                else if(((x<0)||(x>=M))||(T[x]==true)) continue;
                else {
                    T[x]=true;
                    q.offer(x*2);
                    p.offer(y+1);
                    q.offer(x-1);
                    p.offer(y);
                    q.offer(x+1);
                    p.offer(y);
                }
            } while (i<z);
            r++;
        }while(!(q.isEmpty()));
        System.out.print(r-n);
    }
}