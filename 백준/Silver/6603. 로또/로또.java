import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n;
    static int[] op=new int[6],nb;
    static void lotto(int id,int dt){
        if(dt==6){
            for(int i=0;i<6;i++){
                as.append(op[i]).append(' ');
            }
            as.append('\n');
            return;
        }
        for(int i=id;i<n;i++){
            op[dt]=nb[i];
            lotto(i+1,dt+1);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=I.readLine()).equals("0")){
            StringTokenizer st=new StringTokenizer(s);
            n=Integer.parseInt(st.nextToken());
            nb=new int[n];
            for(int i=0;i<n;i++){
                nb[i]=Integer.parseInt(st.nextToken());
            }
            lotto(0,0);
            as.append('\n');
        }
        System.out.println(as);
    }
}