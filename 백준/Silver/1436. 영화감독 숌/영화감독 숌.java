import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine()),r=0,i=666;
        while(true){
            if(String.valueOf(i).contains("666")) r++;
            if(r==n) break;
            i++;
        }
        O.write(i+"\n");
        O.flush();
    }
}