import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder a=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            int c=Integer.parseInt(s.nextToken()),p=Integer.parseInt(s.nextToken());
            a.append(c).append(' ').append(p).append('\n').append((p-2)*c+2).append('\n');
        }
        O.write(a+"\n");
        O.flush();
    }
}