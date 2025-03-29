import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer,String> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();

        StringTokenizer s=new StringTokenizer(I.readLine());

        StringBuilder a=new StringBuilder();
        int n=Integer.parseInt(s.nextToken()),m=Integer.parseInt(s.nextToken());
        for(int i=1;i<=n;i++){
            String t=I.readLine();
            m1.put(i,t);
            m2.put(t,i);
        }
        while(m-->0){
            String t=I.readLine();
            if(Character.isDigit(t.charAt(0))){
                int q=Integer.parseInt(t);
                a.append(m1.get(q)).append("\n");
            }else{
                a.append(m2.get(t)).append("\n");
            }
        }
        O.write(a+"\n");
        O.flush();
    }
}