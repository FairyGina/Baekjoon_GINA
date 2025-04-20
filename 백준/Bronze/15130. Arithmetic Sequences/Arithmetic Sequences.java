import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder as=new StringBuilder();
        StringTokenizer s=new StringTokenizer(I.readLine());
        int q=0,w=0,e=0,r=0,i=0;
        for(;i<9;i++){
            int t=Integer.parseInt(s.nextToken());
            if(t!=0){q=t; w=i; i++; break;}
        }
        for(;i<10;i++){
            int t=Integer.parseInt(s.nextToken());
            if(t!=0){e=t; r=i; break;}
        }
        if((e-q)%(r-w)!=0) as.append(-1);
        else{
            int d=(e-q)/(r-w);
            e=q-d*w;
            for(i=0;i<10;i++){
                as.append(e).append(' ');
                e+=d;
            }
        } 
        O.write(as+"\n");
        O.flush();
    }
}