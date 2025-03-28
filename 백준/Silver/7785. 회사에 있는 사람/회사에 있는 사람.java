import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        Set<String>t=new TreeSet<>(Collections.reverseOrder());
        while(n-->0){
            String s=I.readLine();
            String[] g=s.split(" ");
            if(g[1].equals("enter")){
                t.add(g[0]);
            }else{
                t.remove(g[0]);
            }
        }
        Iterator i =t.iterator();
        StringBuilder a=new StringBuilder();
        while(i.hasNext())a.append(i.next()).append("\n");
        O.write(a+"\n");
        O.flush();
    }
}