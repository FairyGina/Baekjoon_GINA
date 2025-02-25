import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        String a=I.readLine(),b=I.readLine(),c=I.readLine();
        O.write((Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c))+"\n");
        O.write(Integer.parseInt(a+b)-Integer.parseInt(c)+"\n");
        O.flush();
    }
}