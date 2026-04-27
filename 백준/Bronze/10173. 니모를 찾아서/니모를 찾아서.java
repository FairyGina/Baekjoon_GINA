import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals("EOI")){
            if(s.toUpperCase().indexOf("NEMO",0)<0) as.append("Missing\n");
            else as.append("Found\n");
        }
        System.out.print(as);
    }
}