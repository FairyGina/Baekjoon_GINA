import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringBuilder ts=new StringBuilder();
            StringTokenizer s=new StringTokenizer(I.readLine());
            String s1=s.nextToken(),s2=s.nextToken();
            
            int ia=s1.indexOf('1'),ib=s2.indexOf('1');
            s1=(ia<0?"0":s1.substring(ia));
            s2=(ib<0?"0":s2.substring(ib));

            int al=s1.length()-1,bl=s2.length()-1;
            boolean b=false;
            while(al>-1||bl>-1){
                int ta=al>-1?s1.charAt(al)-'0':0,tb=bl>-1?s2.charAt(bl)-'0':0;
                int r=ta+tb+(b==true?1:0);
                b=r>1;
                ts.append(r%2);
                al--; bl--;
            }
            if(b==true) ts.append(1);
            as.append(ts.reverse()).append('\n');
        }
        O.write(as+"\n");
        O.flush();
    }
}