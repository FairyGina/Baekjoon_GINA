import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        if(n<100) System.out.print("99");
        else{
            int tn=n/100*100+99,tm=tn-100;
            System.out.print(tn-n>n-tm?tm:tn);
        }
    }
}