import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder a=new StringBuilder();
        Map<String,Integer> hm=new HashMap<>();
        int n=Integer.parseInt(I.readLine()),c=0;
        int num[]=new int[n];
        StringTokenizer s=new StringTokenizer(I.readLine());
        while(n-->0){
            String t=s.nextToken();
            if(!hm.containsKey(t)){
                hm.put(t,c);
                num[c]++;
                c++;
            } else num[hm.get(t)]++;
        }
        n=Integer.parseInt(I.readLine());
        s=new StringTokenizer(I.readLine());
        while(n-->0){
            String t=s.nextToken();
            if(!hm.containsKey(t)) a.append("0 ");
            else a.append(num[hm.get(t)]).append(' ');
        }
        O.write(a+"\n");
        O.flush();
    }
}