import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        
        HashMap<Integer,String>hm=new HashMap<>();
        int c=Integer.parseInt(I.readLine());
        for(int t=1;t<=c;t++){
            hm.clear();
            int a=Integer.parseInt(I.readLine());
            for(int i=1;i<=a;i++){
                String ip=I.readLine();
                ip=ip.replaceAll(" ","");
                hm.put(i,ip);
            }

            int l=Integer.parseInt(I.readLine());
            as.append(String.format("Customer %d\n",t));
            for(int i=0;i<l;i++){
                StringTokenizer st=new StringTokenizer(I.readLine());
                String sk=hm.get(Integer.valueOf(st.nextToken()));
                int q=Integer.parseInt(st.nextToken()),p=Integer.parseInt(st.nextToken());
                String ans="correct";
                if(sk.charAt(q-1)!=st.nextToken().charAt(0)) ans="error";
                else if(sk.charAt(p-1)!=st.nextToken().charAt(0)) ans="error";
                as.append(ans).append('\n');
            }
        }
        System.out.print(as);
    }
}