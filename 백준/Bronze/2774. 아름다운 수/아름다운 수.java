import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        boolean[] bl=new boolean[58];
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            Arrays.fill(bl,false);
            String s=I.readLine();
            int len=s.length(),r=0;
            while(--len>-1){
                bl[s.charAt(len)]=true;
            }
            for(int i=48;i<58;i++){
                if(bl[i]) r++;
            }
            as.append(r).append('\n');
        }
        System.out.print(as);
    }
}