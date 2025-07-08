import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while((s=I.readLine())!=null){
            char[] ch=s.toCharArray();
            int ln=s.length();
            for(int i=0;i<ln;i++){
                if(ch[i]=='e') ch[i]='i';
                else if(ch[i]=='E') ch[i]='I';
                else if(ch[i]=='i') ch[i]='e';
                else if(ch[i]=='I') ch[i]='E';
            }
            as.append(ch).append('\n');
        }
        System.out.print(as);
    }
}