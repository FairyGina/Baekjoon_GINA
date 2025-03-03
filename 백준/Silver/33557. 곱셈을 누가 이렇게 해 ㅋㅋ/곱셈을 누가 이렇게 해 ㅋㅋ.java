import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(I.readLine());

        while(t-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            String sa=s.nextToken(),sb=s.nextToken();
            long la=Long.parseLong(sa),lb=Long.parseLong(sb);
            la*=lb;
            //System.out.println("la: "+la);

            int l;
            if(sa.length()>sb.length()){
                l=sa.length();
                String rb=String.format("%"+l+"s",sb).replace(' ','1');
                sb=rb;
            } else{
                l=sb.length();
                String ra=String.format("%"+l+"s",sa).replace(' ','1');
                sa=ra;
            }
            StringBuilder SB=new StringBuilder();
            //System.out.println("l: "+l);
            //System.out.println("sa: "+sa);
            //System.out.println("sb: "+sb);
            for(int i=0;i<l;i++){
                int A=sa.charAt(i)-'0',B=sb.charAt(i)-'0';
                //System.out.println("A: "+A);
                //System.out.println("B: "+B);

                SB.append(String.valueOf(A*B));
            }
            //System.out.println("SB: "+SB);
            int ans=0;
            if(SB.toString().equals(String.valueOf(la))) ans=1;
            O.write(ans+"\n");
            

        }
        O.flush();
    }
}