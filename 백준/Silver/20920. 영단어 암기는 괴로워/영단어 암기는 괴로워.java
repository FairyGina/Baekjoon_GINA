import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        HashMap<String,Integer> hs=new HashMap<>();

        for(int i=0;i<n;i++){
            String s=I.readLine();
            int l=s.length(),ct=0;
            if(l<m) continue;
            if(hs.containsKey(s)) ct=hs.get(s);
            hs.put(s,1+ct);
        }

        List<Map.Entry<String,Integer>> wd=new ArrayList<>(hs.entrySet());

        wd.sort((a,b)->{
            int c=Integer.compare(b.getValue(),a.getValue());
            if(c==0) c=Integer.compare(b.getKey().length(),a.getKey().length());
            if(c==0) c=a.getKey().compareTo(b.getKey());
            return c;
        });

        for(Map.Entry<String,Integer> e:wd){
            O.write(e.getKey()+'\n');
        }

        O.flush();
    }
}