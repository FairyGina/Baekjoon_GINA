import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(I.readLine());
        int[] p=new int[1000001];

        p[1]=0; p[2]=1; p[3]=1;

        for(int i=4;i<1000001;i++){
            int a=p[i-1],b=i%2==0?p[i/2]:1000001,c=i%3==0?p[i/3]:1000001;
            p[i]=Math.min(c,Math.min(a,b))+1;
        }

        O.write(p[n]+"\n");
        O.flush();
    }
}