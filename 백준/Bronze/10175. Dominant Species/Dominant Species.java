import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        String t="BCMW";
        Map<Character,String> h=new HashMap<>();
        h.put('B',"Bobcat"); h.put('C',"Coyote"); h.put('M',"Mountain Lion"); h.put('W',"Wolf");
        while(n-->0){
            int[] d=new int[7];
            StringTokenizer s=new StringTokenizer(I.readLine());
            String a=s.nextToken(),b=s.nextToken();
            StringBuilder as=new StringBuilder(a+": ");
            for(int i=0;i<b.length();i++){
                d[t.indexOf(b.charAt(i))]++;
            }
            d[0]*=2; d[2]*=4; d[3]*=3;
            for(int i=0;i<4;i++){
                if(d[4]<d[i]){
                    d[4]=d[i];
                    d[5]=i;
                }
            }
            for(int i=0;i<4;i++){
                if(d[4]==d[i]) d[6]++;
            }
            if(d[6]>1) as.append("There is no dominant species");
            else as.append("The ").append(h.get(t.charAt(d[5]))).append(" is the dominant species");
            O.write(as+"\n");
        }
        O.flush();
    }
}