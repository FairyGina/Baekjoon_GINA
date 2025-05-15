import java.io.*;
import java.util.*;
class Main{
    static void sm(String s,int[] a){
        String[] t=s.split(":");
        for(int i=0;i<3;i++){
            a[i]=Integer.parseInt(t[i]);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        String s;
        int[] hms=new int[3],ip;
        double res=0,r=0,km=0;
        
        while((s=I.readLine())!=null){
            if(s.contains(" ")){
                StringTokenizer st=new StringTokenizer(s);
                ip=new int[3];
                sm(st.nextToken(),ip);
                r=(ip[0]-hms[0])*3600+(ip[1]-hms[1])*60+(ip[2]-hms[2]);
                res+=r*km/3600;
                hms=ip;
                km=Integer.parseInt(st.nextToken());
            }else{
                ip=new int[3];
                sm(s,ip);
                r=(ip[0]-hms[0])*3600+(ip[1]-hms[1])*60+(ip[2]-hms[2]);
                res+=r*km/3600;
                hms=ip;
                as.append(s).append(' ').append(String.format("%.2f",res)).append(" km\n");
                
            }
        }
        System.out.println(as);
    }
}