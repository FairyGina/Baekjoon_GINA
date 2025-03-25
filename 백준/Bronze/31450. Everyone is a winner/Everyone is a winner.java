import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        O.write((Integer.parseInt(s.nextToken())%Integer.parseInt(s.nextToken()))==0?"Yes":"No"+"\n");
        O.flush();
    }
}