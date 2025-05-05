import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while((s=I.readLine())!=null){
            as.append(s).append('\n');
        }
        System.out.println(as);
    }
}