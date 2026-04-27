import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine())-1;
        int x=(7*n+8)%12,y=2024+(8+7*n)/12;
        if(x==0){
            x+=12;
            y--;
        }
        O.write(y+" "+x+"\n");
        O.flush();
    }
}