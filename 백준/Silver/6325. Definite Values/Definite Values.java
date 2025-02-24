import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int t,n=0; //반복 변수
        while((t=Integer.parseInt(I.readLine()))!=0){
            Set<Character> S=new TreeSet<>();
            n++;
            S.add('a');
            while(t-->0){
                String v=I.readLine();
                char v1=v.charAt(0),v2=v.charAt(4);
                if(S.contains(v2)){
                    S.add(v1);
                    continue;
                }
                S.remove(v1);
            }
            O.write("Program #"+n+"\n");
            for(char c:S){
                O.write(c+" ");
            }
            if(S.isEmpty()) O.write("none");
            O.write("\n\n");
        }
        O.flush();
    }
}