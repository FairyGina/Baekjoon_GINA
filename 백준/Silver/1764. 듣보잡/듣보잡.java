import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder a=new StringBuilder();
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),m=Integer.parseInt(s.nextToken());
        Map<String,Boolean> h=new TreeMap<>();
        while(n-->0){
            String e=I.readLine();
            h.put(e,false);
        }
        n++;
        while(m-->0){
            String e=I.readLine();            
            if(h.containsKey(e)){
                h.put(e,true);
                n++;
            }
        }
        for(Map.Entry<String,Boolean>t:h.entrySet()){
            if(t.getValue()){
                a.append(t.getKey()).append('\n');
            }
        }
        a.insert(0,n+"\n");
        O.write(a+"\n");
        O.flush();
    }
}