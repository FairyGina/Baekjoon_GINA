import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
            Deque<int[]> arr=new ArrayDeque<>();
            int[] pri=new int[10];
            st=new StringTokenizer(I.readLine());
            for(int i=0;i<n;i++){
                int ti=Integer.parseInt(st.nextToken());
                arr.offer(new int[]{ti,i});
                pri[ti]++;
            }
            int th=0;
            L:while(true){
                int[] a=arr.poll();
                for(int i=9;i>a[0];i--){
                    if(pri[i]>0){
                        arr.offer(a);
                        continue L;
                    }
                }
                pri[a[0]]--; th++;
                if(a[1]==m){
                    as.append(th).append('\n');
                    break;
                }
            }
        }
        System.out.print(as);
    }
}