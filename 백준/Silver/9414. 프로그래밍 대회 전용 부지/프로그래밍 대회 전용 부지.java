import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int[] g=new int[40];
            int i=0,r=0;
            do { 
              g[i]=Integer.parseInt(I.readLine());
              i++;
            }while(g[i-1]!=0);
            g=Arrays.copyOf(g,i);
            Arrays.sort(g);
            boolean f=true;
            i--;
            for(int j=1;i>-1;i--,j++){
                r+=Math.pow(g[i],j);
                if(r>2500000){
                    as.append("Too expensive").append('\n');
                    f=false; break;
                }
            }
            if(f) as.append(2*r).append('\n');
        }
        System.out.println(as);
    }
}