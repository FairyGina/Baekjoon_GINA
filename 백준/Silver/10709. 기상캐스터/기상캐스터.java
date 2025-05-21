import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int h=Integer.parseInt(st.nextToken()),w=Integer.parseInt(st.nextToken());
        for(int i=0;i<h;i++){
            String s=I.readLine();
            int id;
            if((id=s.indexOf("c",0))<0){
                for(int k=0;k<w;k++){
                    as.append("-1 ");
                }
                as.append('\n');
            }else{
                for(int k=0;k<id;k++){
                    as.append("-1 ");
                }
                int ct=0;
                for(int k=id;k<w;k++){
                    if(s.charAt(k)=='c') ct=0;
                    as.append(ct++).append(' ');
                }
                as.append('\n');
            }
        }
        System.out.print(as);
    }
}