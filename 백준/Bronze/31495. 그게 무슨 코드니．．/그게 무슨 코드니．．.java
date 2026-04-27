import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        if(s.length()==1) System.out.print("CE");
        else if(s.charAt(0)!='"'||s.charAt(s.length()-1)!='"') System.out.print("CE");
        else if(s.length()==2) System.out.print("CE");
        else System.out.print(s.substring(1, s.length()-1));
    }
}
