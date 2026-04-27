import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            String s=I.readLine();
            as.append(Integer.parseInt(s,2)).append('\n');
        }
        System.out.print(as);
    }
}