import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),k=s.nextInt(),r=0,M=100001;
        boolean[] T=new boolean[M];
        Queue<Integer> q=new LinkedList<>();
        q.offer(n);
        L:do{
            int z=q.size(), i=0;
            do {
                i++;
                int x=q.poll();
                if(x==k) break L;
                else if(((x<0)||(x>=M))||(T[x]==true)) continue;
                else {
                    T[x]=true;
                    q.offer(x*2);
                    q.offer(x-1);
                    q.offer(x+1);
                }
            } while (i<z);
            r++;
        }while(!(q.isEmpty()));
        System.out.print(r);
    }
}