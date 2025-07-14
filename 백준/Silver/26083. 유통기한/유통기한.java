import java.io.*;
import java.util.*;
public class Main{
    static int[] day={0,31,28,31,30,31,30,31,31,30,31,30,31};
    static int y,m,d;

    static boolean able(int yy,int mm,int dd){
        if(yy!=y) return y<yy;
        if(mm!=m) return m<mm;
        return d<=dd;
    }
    
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        y=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        d=Integer.parseInt(st.nextToken());

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            st=new StringTokenizer(I.readLine());
            int ty=Integer.parseInt(st.nextToken()),tm=Integer.parseInt(st.nextToken()),td=Integer.parseInt(st.nextToken());
            int[] data={ty,tm,td,td,tm,ty,td,ty,tm};

            boolean val=false;
            String ans="invalid\n";

            for(int i=0;i<7;i+=3){
                int yy=data[i],mm=data[i+1],dd=data[i+2];
                if(0<mm&&mm<13){
                    int ld=day[mm];
                    if(mm==2&&yy%4==0) ld++;
                    if(0<dd&&dd<=ld){
                        val=true;
                        if(!able(yy, mm, dd)){
                            ans="unsafe\n";
                            break;
                        }
                    }
                }
            }
            if (!ans.equals("unsafe\n")&&val) ans = "safe\n";
            as.append(ans);
        }
        System.out.print(as);
    }
}