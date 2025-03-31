import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine()),r=0;
        Map<String,Integer> m=new HashMap<>();
        m.put("136",1000);
        m.put("142",5000);
        m.put("148",10000);
        m.put("154",50000);
        while(n-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            r+=m.get(s.nextToken());
        }
        O.write(r+"\n");
        O.flush();
    }
}