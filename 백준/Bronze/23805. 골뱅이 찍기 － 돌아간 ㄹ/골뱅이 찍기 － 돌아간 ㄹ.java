import java.io.*;
class Main{
    static BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    public static void f(String s)throws Exception{
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<n;k++) O.write(s.charAt(j));
            }
            O.write("\n");
        }
    }
    public static void main(String[] args)throws Exception{
        n=Integer.parseInt(I.readLine());
        f("@@@ @");
        for(int i=0;i<3;i++) f("@ @ @");
        f("@ @@@");
        O.flush();
    }
}