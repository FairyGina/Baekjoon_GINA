import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());

        StringTokenizer st=new StringTokenizer(I.readLine());
        int ct=1,last=Integer.parseInt(st.nextToken()),mx=0;
        for(int i=1;i<n;i++){
            int v=Integer.parseInt(st.nextToken());
            if(last>=v){
                mx=Math.max(mx,ct);
                ct=1;
            }else{
                ct++;
            }
            last=v;
        }
        mx=Math.max(mx,ct);

        System.out.print(mx);
    }
}