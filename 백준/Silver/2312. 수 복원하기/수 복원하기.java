import java.io.*;
class Main{
    static int lm=100001,plm=9592;
    static boolean[] prime=new boolean[100001];
    static int[] pnb=new int[plm];
    static void pri(){
        prime[0]=prime[1]=true;
        for(int i=2;i*i<100001;i++){
            if(!prime[i]){
                for(int j=i*i;j<100001;j+=i){
                    prime[j]=true;
                }
            }
        }
    }
    static void insnb(){
        int id=0;
        for(int i=2;i<100001;i++){
            if(!prime[i]){
                pnb[id++]=i;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        pri(); insnb();
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int ct=0;
            int n=Integer.parseInt(I.readLine());
            for(int i=0;i<plm;i++){
                if(n%pnb[i]==0){
                    ct++;
                    n/=pnb[i];
                    i--;
                }else{
                    if(ct>0){
                        as.append(String.format("%d %d\n",pnb[i],ct));
                        ct=0;
                    }if(n==1) break;
                }
            }
        }
        System.out.print(as);
    }
}