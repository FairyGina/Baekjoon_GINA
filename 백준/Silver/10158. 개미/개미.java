import java.io.*;
import java.util.StringTokenizer;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int w=Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(I.readLine());
        int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());

        int t=Integer.parseInt(I.readLine());

        int x=w-Math.abs(w-(p+t)%(2*w));
        int y=h-Math.abs(h-(q+t)%(2*h));

        System.out.println(x+" "+y);
    }
}