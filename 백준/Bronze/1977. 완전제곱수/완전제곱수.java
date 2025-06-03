import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(I.readLine()),n=Integer.parseInt(I.readLine());
        int i=1,r=0;
        while(true){
            if(i*i>=m){
                m=i*i;
                break;
            }
            i++;
        }
        while(true){
            int tr=i*i;
            if(tr>n) break;
            r+=tr;
            i++;
        }
        if(r==0){
            System.out.print(-1);
            return;
        }
        System.out.println(r);
        System.out.print(m);
    }
}