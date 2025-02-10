import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(b.readLine());
        while(i-->0){
            StringTokenizer s=new StringTokenizer(b.readLine());
            s.nextToken();
            StringBuilder r=new StringBuilder("god");
            while(s.hasMoreTokens()){
                r.append(s.nextToken());
            }
            System.out.println(r);
        }
    }
}