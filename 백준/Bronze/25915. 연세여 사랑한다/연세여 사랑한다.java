import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        String n=I.readLine();
        int a=(int)n.charAt(0);
        O.write(Math.abs(a-73)+84+"\n");
        O.flush();
    }
}