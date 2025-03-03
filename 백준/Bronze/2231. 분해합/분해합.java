import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine()),m=1000000;
        for(int i=n-9*((int)Math.log10(n)+1);i<n;i++){
            String s=String.valueOf(i);
            int l=s.length(),t=i;
            for(int j=0;j<l;j++) t+=s.charAt(j)-'0';
            if(t==n&&m>i){
                m=i;
                break;
            }
        }
        O.write((m!=1000000?m:0)+"\n");
        O.flush();
    }
}