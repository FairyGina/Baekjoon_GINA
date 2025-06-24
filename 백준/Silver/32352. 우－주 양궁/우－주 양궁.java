import java.io.*;
import java.util.*;
class Main{
    static boolean bl=true;
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int ax0=Integer.parseInt(st.nextToken()),ax1=Integer.parseInt(st.nextToken()),
        ay0=Integer.parseInt(st.nextToken()),ay1=Integer.parseInt(st.nextToken()),
        az0=Integer.parseInt(st.nextToken()),az1=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(I.readLine());
        int bx0=Integer.parseInt(st.nextToken()),bx1=Integer.parseInt(st.nextToken()),
        by0=Integer.parseInt(st.nextToken()),by1=Integer.parseInt(st.nextToken()),
        bz0=Integer.parseInt(st.nextToken()),bz1=Integer.parseInt(st.nextToken());
        long res=1;

        if((ax0<bx0&&ax1<=bx0)||(ax0>=bx1&&ax1>bx1)) bl=false;
        if((ay0<by0&&ay1<=by0)||(ay0>=by1&&ay1>by1)) bl=false;

        if(bl) res=bz1-az0-1;
        System.out.print(-res);
    }
}