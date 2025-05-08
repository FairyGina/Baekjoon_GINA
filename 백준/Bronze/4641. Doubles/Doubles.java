import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals("-1")){
            int[] nb=new int[16];
            int nl=0,r=0;
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens()){
                int t=Integer.parseInt(st.nextToken());
                nb[nl++]=t;
            }
            nl--;
            for(int i=0;i<nl;i++){
                for(int j=0;j<nl;j++)
                    if(nb[i]==2*nb[j]) r++;
            }
            as.append(r).append('\n');
        }
        System.out.println(as);
    }
}