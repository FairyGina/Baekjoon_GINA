import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(b.readLine()),r=0;
        for(int i=0;i<=(n-4)/2;i++) r+=i;
        System.out.print(r);
    }
}