import java.io.*;
import java.util.*;
class Main{
    static boolean[] np=new boolean[1001];
    static void pm(){
        for(int i=2;i*i<1001;i++){
            for(int j=i*i;j<1001;j+=i)
                np[j]=true;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        pm();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(I.readLine());
        int c=Integer.parseInt(st.nextToken()),d=Integer.parseInt(st.nextToken());

        int yt=0,yj=0,gap=0;
        for(int i=a;i<=b;i++){
            if(!np[i]) yt++;
        }
        for(int i=c;i<=d;i++){
            if(!np[i]) yj++;
        }
        for(int i=c;i<=b;i++){
            if(!np[i]) gap++;
        }
        yt-=gap; yj-=gap;
        if(gap%2!=0) yt++;
        System.out.print(yt>yj?"yt":"yj");
    }
}