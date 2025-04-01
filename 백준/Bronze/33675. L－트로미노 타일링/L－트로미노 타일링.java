import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        long[] l=new long[101];
        l[2]=2;
        for(int i=4;i<101;i+=2){
            l[i]=l[i-2]*2;
        }
        StringBuilder a=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            a.append(l[n]).append('\n');
        }
        O.write(a+"\n");
        O.flush();
    }
}