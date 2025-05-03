import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine(),as;
        if(s.equals("SONGDO")) as="HIGHSCHOOL";
        else if(s.equals("CODE")) as="MASTER";
        else if(s.equals("2023")) as="0611";
        else as="CONTEST";
        System.out.println(as);
    }
}