import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        Set<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        String s=I.readLine();
        int l=s.length(),i=l;
        while(--i>-1){
            if(hs.contains(s.charAt(i))) break;
        }
        s=s.substring(0,i+1);
        System.out.println(s+"ntry");
    }
}