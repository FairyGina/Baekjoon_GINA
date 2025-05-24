import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        String s;
        while(!(s=I.readLine()).equals("0")){
            StringTokenizer st=new StringTokenizer(s);
            int n=Integer.parseInt(st.nextToken());
            int[] xa=new int[n];
            for(int i=0;i<n;i++){
                xa[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(I.readLine());
            int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken()),res=0;

            for(int i=0;i<n;i++){
                res+=xa[i]*Math.pow(x,i);
            }

            String ans="On";
            if(res<y) ans="Outside";
            else if(res>y) ans="Inside";
            as.append(ans).append('\n');
        }
        System.out.print(as);
    }
}