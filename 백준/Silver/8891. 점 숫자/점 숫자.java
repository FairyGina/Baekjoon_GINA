import java.io.*;
import java.util.*;
class Main{
    static int ag=10001;
    static int[] xa=new int[ag],ya=new int[ag];
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int ct=1;
        L:for(int i=1;;i++){
            for(int j=1,k=i;j<=i;j++,k--){
                xa[ct]=j;
                ya[ct]=k;
                if(++ct==ag) break L;
            }
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            int x=xa[a]+xa[b],y=ya[a]+ya[b];
            int n=x+y;
            as.append((n*n-3*n)/2+x+1).append('\n');
        }
        System.out.println(as);
    }
}