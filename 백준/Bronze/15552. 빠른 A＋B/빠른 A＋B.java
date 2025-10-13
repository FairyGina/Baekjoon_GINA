import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans=new StringBuilder();

        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            ans.append(a+b).append('\n');
        }

        System.out.print(ans);
    }
}
