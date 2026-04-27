import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        String s;
        while(!(s=I.readLine()).equals("#")){
            StringTokenizer st=new StringTokenizer(s);
            char c=st.nextToken().charAt(0);
            int r=0;
            while(st.hasMoreTokens()){
                String ts=st.nextToken();
                int id,lc=0;
                while((id=ts.toLowerCase().indexOf(c,lc))>-1){
                    r++;
                    lc=id+1;
                }
            }
            as.append(c).append(' ').append(r).append('\n');
        }
        System.out.print(as);
    }
}