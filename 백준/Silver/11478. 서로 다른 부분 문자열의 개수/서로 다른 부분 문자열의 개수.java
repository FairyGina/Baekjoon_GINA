import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        String s=I.readLine();
        Set<String> m=new HashSet<>();
        int l=s.length();
        for(int i=1;i<=l;i++){
            for(int j=0;j+i<=l;j++){
                String t=s.substring(j,j+i);
                m.add(t);
            }
        }
        O.write(m.size()+"\n");
        O.flush();
    }
}