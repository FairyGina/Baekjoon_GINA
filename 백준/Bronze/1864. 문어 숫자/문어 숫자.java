import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('-',0);
        hm.put('\\',1);
        hm.put('(',2);
        hm.put('@',3);
        hm.put('?',4);
        hm.put('>',5);
        hm.put('&',6);
        hm.put('%',7);
        hm.put('/',-1);
        String s;
        while(!(s=I.readLine()).equals("#")){
            long res=0;
            int len=s.length();
            int x=len-1;
            for(int i=0;i<len;i++){
                res+=Math.pow(8,x--)*hm.get(s.charAt(i));
            }
            as.append(res).append('\n');
        }
        System.out.print(as);
    }
}