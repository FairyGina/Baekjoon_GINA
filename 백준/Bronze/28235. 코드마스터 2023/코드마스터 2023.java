import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine(),as;
        if(s.charAt(0)=='S') as="HIGHSCHOOL";
        else if(s.charAt(0)=='C') as="MASTER";
        else if(s.charAt(0)=='2') as="0611";
        else as="CONTEST";
        System.out.println(as);
    }
}