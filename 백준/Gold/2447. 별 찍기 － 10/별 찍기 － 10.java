import java.io.*;
class Main{
    static int n;
    static StringBuilder[] star;
    static StringBuilder sp=new StringBuilder("   ");
    static void mkst(int ip){
        if(ip>n) return;

        int ct=ip/3,id=-1;
        String[] t=new String[ct];
        for(int i=0;i<ct;i++){
            t[i]=String.valueOf(star[i]);
        }

        int i=-1;
        while(++i<ct){
            star[++id]=new StringBuilder(t[i]);
            star[id].append(t[i]).append(t[i]);
        }
        i=-1;
        while(++i<ct){
            star[++id]=new StringBuilder(t[i]);
            star[id].append(sp).append(t[i]);
        }
        i=-1;
        while(++i<ct){
            star[++id]=star[i];
        }
        String ts=String.valueOf(sp);
        sp.append(ts).append(ts);

        mkst(ip*3);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder as=new StringBuilder();

        n=Integer.parseInt(I.readLine());

        star=new StringBuilder[n];
    
        star[0]=new StringBuilder("***");
        star[1]=new StringBuilder("* *");
        star[2]=new StringBuilder("***");

        mkst(9);

        for(int i=0;i<n;i++){
            as.append(star[i]).append('\n');
        }

        System.out.println(as);
    }
}