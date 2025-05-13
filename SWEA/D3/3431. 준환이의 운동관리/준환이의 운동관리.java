import java.io.*;
import java.util.StringTokenizer;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int l=Integer.parseInt(st.nextToken()),u=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
            int res=0;
            if(l-x>=0) res=l-x;
            else if(x>u) res=-1;
            else res=0;
            as.append('#').append(t).append(' ').append(res).append('\n');
        }
        System.out.print(as);
    }
}