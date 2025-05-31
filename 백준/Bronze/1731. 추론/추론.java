import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        int q=Integer.parseInt(I.readLine()),w=Integer.parseInt(I.readLine()),e=Integer.parseInt(I.readLine());
        String lt=String.valueOf(e);
        int as=3;
        while(as++<n) lt=I.readLine();

        as=Integer.parseInt(lt);
        if((e%w==0&w%q==0)&&(e/w==w/q)){
            int d=e/w;
            as*=d;
        }else{
            int d=e-w;
            as+=d;
        }
        System.out.print(as);
    }
}