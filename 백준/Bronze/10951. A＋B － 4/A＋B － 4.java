import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans=new StringBuilder();

        String ip="";
        while((ip=br.readLine())!=null){
            StringTokenizer st=new StringTokenizer(ip);
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            ans.append(a+b).append('\n');
        }

        System.out.print(ans);
    }
}
