import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        int[] nb=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) nb[i]=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken())-1,b=Integer.parseInt(st.nextToken())-1;

        int[] vt=new int[n];
        Arrays.fill(vt,-1);

        vt[a]=0;

        Deque<Integer> dq=new ArrayDeque<>();
        dq.offer(a);
        dq.offer(nb[a]);

        while(!dq.isEmpty()){
            int idx=dq.pollFirst(),x=dq.pollFirst();
            if(idx==b) break;

            for(int start=idx%x;start<n;start+=x){
                
                if(vt[start]<0){
                    vt[start]=vt[idx]+1;
                    dq.offer(start); dq.offer(nb[start]);
                }
            }
        }
        
        System.out.print(vt[b]);
    }
}