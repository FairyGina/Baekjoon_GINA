import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine());
        StringBuilder as=new StringBuilder();
        while(t-->0){
            String s=I.readLine();
            as.append(s);
            if(s.charAt(s.length()-1)!='.') as.append('.');
            as.append('\n');
        }
        System.out.println(as);
    }
}