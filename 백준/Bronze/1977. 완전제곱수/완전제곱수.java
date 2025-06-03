import java.io.*;
class Main{
    static int m,n,r=0,mn;
    static void fd(int i){
        if(i*i>=m){
            m=i;
            mn=i*i;
            return;
        }
        fd(++i);
    }
    static void sc(int i){
        int tr=i*i;
        if(tr>n) return;
        r+=tr;
        sc(++i);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        m=Integer.parseInt(I.readLine());
        fd(1);
        n=Integer.parseInt(I.readLine());
        sc(m);
        if(r==0){
            System.out.print(-1);
            return;
        }
        System.out.println(r);
        System.out.print(mn);
    }
}