import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s=I.readLine();
        if(s.equals("fdsajkl;")||s.equals("jkl;fdsa")) System.out.print("in-out");
        else if(s.equals("asdf;lkj")||s.equals(";lkjasdf")) System.out.print("out-in");
        else if(s.equals("asdfjkl;")) System.out.print("stairs");
        else if(s.equals(";lkjfdsa")) System.out.print("reverse");
        else System.out.print("molu");
    }
}