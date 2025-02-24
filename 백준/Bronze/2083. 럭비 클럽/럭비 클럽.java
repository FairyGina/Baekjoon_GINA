import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringTokenizer s=new StringTokenizer(I.readLine());
            String n=s.nextToken();
            int a=Integer.parseInt(s.nextToken()), k=Integer.parseInt(s.nextToken());
            if(n.equals("#")) break;
            if(a>17||k>79) O.write(n+" Senior\n");
            else O.write(n+" Junior\n");
        O.flush();
        }
        
    }
}