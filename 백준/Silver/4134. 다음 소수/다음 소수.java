import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            long n=Long.parseLong(I.readLine());
            if(n<2) n=2;
            else{
                L:while(true){
                    for(long i=2;i*i<=n;i++){
                        if(n%i==0){
                            n++;
                            continue L;
                        } 
                    }
                    break;
                }
            }
            as.append(n).append('\n');
        }
        System.out.println(as);
    }
}