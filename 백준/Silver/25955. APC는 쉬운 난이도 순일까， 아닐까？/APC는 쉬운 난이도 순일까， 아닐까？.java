import java.io.*;
import java.util.*;
class Main{
    static int lt,ls;
    static int tier,step;
    static String lev="BSGPD";
    static void ch(String s){
        tier=lev.indexOf(s.charAt(0));
        step=Integer.parseInt(s.substring(1,s.length()));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine()),ct=0;
        StringTokenizer st=new StringTokenizer(I.readLine());
        boolean fd=false;
        String x="",save=st.nextToken(),o=save;

        ch(save);
        lt=tier; ls=step;

        while(--n>0){
            String s=st.nextToken();
            ch(s);

            if(lt>tier){
                ct++;
                if(fd){
                    o=s;
                }else{
                    fd=true;
                    o=s;
                    x=save;
                }
            }else if(lt==tier&&ls<step){
                ct++;
                if(fd){
                    o=s;
                }else{
                    fd=true;
                    o=s;
                    x=save;
                }
            }
            lt=tier; ls=step; save=s;
        }
        if(ct<1){
            System.out.print("OK");
        }else{
            as.append("KO\n").append(o).append(' ').append(x);
        }
        System.out.print(as);
    }
}