import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        boolean[] b=new boolean[1000001];
        int t=Integer.parseInt(I.readLine());
        b[0]=b[1]=true;
        for(int i=2;i*i<=1000000;i++){
            if(!b[i]){
                for(int j=i*i;j<=1000000;j+=i){
                    b[j]=true;
                }
            }
        }
        while(t-->0){
            int n=Integer.parseInt(I.readLine()),r=0;
            int l=n/2;
            for(int i=2;i<=l;i++){
                if(!(b[i]||b[n-i])) r++;
            }
            as.append(r).append("\n");
        }
        System.out.println(as);
    }
}