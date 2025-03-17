import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine()),min=50001;
        int m5=n/5*5;
        for(int i=m5;i>-1;i-=5){
            int t=n-i;
            if(t%2==0){
                int m2=t/2;
                if(m2+i/5<min){
                    min=m2+i/5;
                }
            }
        }
        if(min>50000) min=-1;
        O.write(min+"\n");
        O.flush();
    }
}