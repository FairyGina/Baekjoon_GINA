import java.io.*;
import java.util.*;
class Main{
    static boolean m,z;
    public static String p(){
        if(m==true){
            if(z==true) return "both";
            else return "mack";
        }else if(z==true) return "zack";
        else return "none";
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            m=false;z=false;
            for(int i=0;i<10;i++){
                String t=s.nextToken();
                if("17".equals(t)) z=true;
                else if("18".equals(t)) m=true;
                O.write(t+" ");
            }
            O.write("\n"+p()+"\n\n");
        }
        O.flush();
    }
}