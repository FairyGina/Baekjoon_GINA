import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),m=Integer.parseInt(s.nextToken());
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<n;i++) h.add(I.readLine());
        n=0;
        for(int i=0;i<m;i++) if(h.contains(I.readLine())) n++;
        O.write(n+"\n");
        O.flush();
    }
}