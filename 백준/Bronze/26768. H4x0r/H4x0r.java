import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        String s=I.readLine();
        Map<Character,Character>m=new HashMap<>();
        m.put('a','4');
        m.put('e','3');
        m.put('i','1');
        m.put('o','0');
        m.put('s','5');
        for(Map.Entry<Character,Character>e:m.entrySet()){
            s=s.replace(e.getKey(),e.getValue());
        }
        O.write(s+"\n");
        O.flush();
    }
}