import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));    
        int t=Integer.parseInt(I.readLine());
        int[] d=new int[12];
        d[1]=1; d[2]=2; d[3]=4; 
        for(int i=4;i<12;i++) d[i]=d[i-1]+d[i-2]+d[i-3];
        while(t-->0) O.write(d[Integer.parseInt(I.readLine())]+"\n");
        O.flush();
    }
}