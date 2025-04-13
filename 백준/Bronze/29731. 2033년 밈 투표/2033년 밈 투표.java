import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> m=new HashSet<>();

        m.add("Never gonna give you up");
        m.add("Never gonna let you down");
        m.add("Never gonna run around and desert you");
        m.add("Never gonna make you cry");
        m.add("Never gonna say goodbye");
        m.add("Never gonna tell a lie and hurt you");
        m.add("Never gonna stop");

        String as="No";

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            String s=I.readLine();
            if(!m.contains(s)){
                as="Yes";
                break;
            }
        }
        O.write(as+"\n");
        O.flush();
    }
}