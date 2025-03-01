import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        HashSet<Integer> h = new HashSet<>();
        StringTokenizer s=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            h.add(Integer.valueOf(s.nextToken()));
        }
        n=Integer.parseInt(I.readLine());
        s=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            if(h.contains(Integer.valueOf(s.nextToken()))) O.write(1+"\n");
            else O.write(0+"\n");
        }
        O.flush();
    }
}