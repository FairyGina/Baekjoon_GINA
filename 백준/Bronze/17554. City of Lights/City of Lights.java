import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine())+1,k=Integer.parseInt(I.readLine()),m=0;
        boolean lg[]=new boolean[n]; //on: false off: true
        while(k-->0){
            int q=Integer.parseInt(I.readLine()),r=0;
            for(int i=q;i<n;i+=q) lg[i]=!lg[i];
            for(int i=1;i<n;i++) if(lg[i]) r++;
            if(m<r) m=r;
        }
        O.write(m+"\n");
        O.flush();
    }
}