import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(I.readLine());
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(I.readLine());
        }
        List<String> l=new ArrayList<>(s);
        Collections.sort(l,(a,b)->{
            int lc=a.length()-b.length();
            if(lc==0) return a.compareTo(b);
            else return lc;
        });
        for(String i:l){
            O.write(i+"\n");
        }
        O.flush();
    }
}