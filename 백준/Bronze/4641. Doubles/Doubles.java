import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals("-1")){
            int[] nb=new int[16],fb=new int[16];
            int nl=0,fl=0,r=0;

            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens()){
                int t=Integer.parseInt(st.nextToken());
                nb[nl++]=t;
                if(t%2==0) fb[fl++]=t;
            }
            nl--; fl--;
            while(nl-->0){
                for(int i=0;i<fl;i++){
                    if(fb[i]==2*nb[nl]) r++;
                }
            }
            as.append(r).append('\n');
        }
        System.out.println(as);
    }
}