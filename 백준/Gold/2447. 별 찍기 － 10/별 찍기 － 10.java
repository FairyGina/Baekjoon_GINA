import java.io.*;
class Main{
    static int n;
    static StringBuilder[] star;
    static StringBuilder sp=new StringBuilder("   ");
    static void mkst(int ip){
        if(ip>n) return;
        StringBuilder[] make=new StringBuilder[ip];
        int ct=ip/3,id=-1;
        int i=-1;
        while(++i<ct){
            make[++id]=new StringBuilder(star[i]);
            make[id].append(star[i]).append(star[i]);
        }
        i=-1;
        while(++i<ct){
            make[++id]=new StringBuilder(star[i]);
            make[id].append(sp).append(star[i]);
        }
        i=-1;
        while(++i<ct){
            make[++id]=make[i];
        }
        String ts=String.valueOf(sp);
        sp.append(ts).append(ts);
        star=make;
        mkst(ip*3);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        n=Integer.parseInt(I.readLine());
        star=new StringBuilder[3];
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