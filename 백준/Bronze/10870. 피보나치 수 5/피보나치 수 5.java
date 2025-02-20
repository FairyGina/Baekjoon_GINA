import java.io.*;
class Main{
    static int r=0;
    public static int f(int i){
        if(i<3) return r+=1;
        else return f(i-1)+f(i-2);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        f(n);
        if(n==0) r=0;
        O.write(r+"\n");
        O.flush();
    }
}