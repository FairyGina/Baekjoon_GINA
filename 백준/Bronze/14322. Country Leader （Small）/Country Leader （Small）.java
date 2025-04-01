import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        StringBuilder as=new StringBuilder();
        for(int i=1;i<=t;i++){
            int n=Integer.parseInt(I.readLine()),m=0;
            StringBuilder a=new StringBuilder();
            while(n-->0){
                Set<Character> h=new HashSet<>();
                String ts=I.readLine();
                String s=ts.replace(" ","");
                int l=s.length();
                for(int j=0;j<l;j++){
                    h.add(s.charAt(j));
                }
                l=h.size();
                String tm=a.toString();
                if(m<l){
                    m=l;
                    a.replace(0,a.length(),ts);
                } else if(m==l&&ts.compareTo(tm)<0){
                    a.replace(0,a.length(),ts);
                }
            }
            as.append("Case #").append(i).append(": ").append(a).append('\n');
        }
        O.write(as+"\n");
        O.flush();
    }
}