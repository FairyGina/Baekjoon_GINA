import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine())-1;
        if(n<0) n=0;
        String s="WelcomeToSMUPC";
        O.write(s.charAt(n%14)+"\n");
        O.flush();
    }
}