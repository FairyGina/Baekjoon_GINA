import java.io.*;
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        String[] arr={"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String a:arr) s=s.replace(a," ");
        System.out.print(s.length());
    }
}