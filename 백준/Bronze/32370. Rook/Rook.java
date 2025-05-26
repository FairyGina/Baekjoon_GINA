import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int ax=Integer.parseInt(st.nextToken()),ay=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(I.readLine());
        int bx=Integer.parseInt(st.nextToken()),by=Integer.parseInt(st.nextToken());
        int r=2;
        if(ax==0){
            if(bx!=0) r=1;
            else if(by<ay)r=3;
            else r=1;
        }
        if(ay==0){
            if(by!=0) r=1;
            else if(bx<ax) r=3;
            else r=1;
        }

        System.out.print(r);
    }
}