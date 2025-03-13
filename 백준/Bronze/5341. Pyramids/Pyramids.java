import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n!=0){
            O.write(n*(n+1)/2+"\n");
            n=Integer.parseInt(I.readLine());
        }
        O.flush();
    }
}