import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O =new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while((s=I.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s);
            int h=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
            O.write(String.format("%.2f\n",(float)h/m));
            O.flush();
        }
    }
}