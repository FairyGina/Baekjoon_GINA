import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int[] fap=new int[92],com=new int[92];
        int n=Integer.parseInt(I.readLine()),res=0;
        String ps=I.readLine();
        int ln=ps.length();
        for(int i=0;i<ln;i++){
            fap[ps.charAt(i)]++;
        }
        while(--n>0){
            ps=I.readLine();
            int cln=ps.length(),ch=1;
            if(cln==ln) ch=2;
            Arrays.fill(com,0);
            for(int i=0;i<cln;i++){
                com[ps.charAt(i)]++;
            }
            int ct=0;
            for(int i=65;i<92;i++){
                ct+=Math.abs(fap[i]-com[i]);
            }
            if(ct>ch) continue;
            res++;
        }
        System.out.print(res);
    }
}