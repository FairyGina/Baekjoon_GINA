import java.io.*;
class Main{
    static BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    public static void f(String s)throws Exception{
        for(int i=0;i<n;i++){
            for(int j=0;j<s.length();j++){
                for(int k=0;k<n;k++) O.write(s.charAt(j));
            }
            O.write("\n");
        }
    }
    public static void main(String[] args)throws Exception{
        n=Integer.parseInt(I.readLine());
        f("@   @");
        f("@  @");
        f("@@@");
        f("@  @");
        f("@   @");
        O.flush();
    }
}