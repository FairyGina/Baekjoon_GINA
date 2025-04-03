import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        StringBuilder a=new StringBuilder();
        while(n-->0){
            String s=I.readLine();
            a.append(s.length()).append('\n');
        }
        O.write(a+"\n");
        O.flush();
    }
}