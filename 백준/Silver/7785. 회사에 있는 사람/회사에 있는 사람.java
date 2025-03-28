import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        Set<String>t=new TreeSet<>(Collections.reverseOrder());
        while(n-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            String a=s.nextToken(),b=s.nextToken();
            if(b.equals("enter")) t.add(a);
            else t.remove(a);
        }
        StringBuilder a=new StringBuilder();
        for(String i:t) a.append(i).append("\n");
        O.write(a+"\n");
        O.flush();
    }
}