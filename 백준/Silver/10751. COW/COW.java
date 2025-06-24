import java.io.*;
class Main{
    static boolean bl=true;
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        long[] ct=new long[3];
        int n=Integer.parseInt(I.readLine());
        String s=I.readLine();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='C') ct[0]++;
            else if(c=='O') ct[1]+=ct[0];
            else ct[2]+=ct[1];
        }
        System.out.print(ct[2]);
    }
}