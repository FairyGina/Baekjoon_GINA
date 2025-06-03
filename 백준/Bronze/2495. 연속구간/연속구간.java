import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        String[] str=new String[3];
        for(int t=0;t<3;t++){
            str[t]=I.readLine();
            char c='0';
            int ct=0,max=0;
            for(int i=0;i<8;i++){
                char tc=str[t].charAt(i);
                if(c!=tc){
                    if(ct>max) max=ct;
                    c=tc;
                    ct=0;
                }
                ct++;
            }
            if(ct>max) max=ct;
            str[t]=String.valueOf(max);
        }
        for(String i:str) System.out.println(i);
    }
}