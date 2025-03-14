import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            int m=Integer.parseInt(I.readLine()),r=1;
            for(int i=2;i<=m/2;i++) if(m%i==0) r+=i;
            O.write(m+" is a");
            if(r>m) O.write("n abundant number.\n\n");
            else if(r<m) O.write(" deficient number.\n\n");
            else O.write(" perfect number.\n\n");
        }
        O.flush();
    }
}