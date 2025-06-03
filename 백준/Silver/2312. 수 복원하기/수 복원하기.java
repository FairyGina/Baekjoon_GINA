import java.io.*;
class Main{
    static int lm=100001;
    static boolean[] prime=new boolean[lm];
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
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        pri();
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int ct=0;
            int n=Integer.parseInt(I.readLine());
            for(int i=0;i<lm;i++){
                if(!prime[i]){
                    if(n%i==0){
                        ct++;
                        n/=i;
                        i--;
                    }else{
                        if(ct>0){
                            as.append(i).append(' ').append(ct).append('\n');
                            ct=0;
                        }if(n==1) break;
                    }
                }
            }
        }
        System.out.print(as);
    }
}