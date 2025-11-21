import java.io.*;
import java.util.*;
class Main {
    static String s;
    static int ct=0;
    public static void f1(String str1){
        s=s.replace(str1," ");
        int ln=s.length();
    }
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        s=I.readLine();
        String[] arr={"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String a:arr) f1(a);
        System.out.print(ct+s.length());
    }
}