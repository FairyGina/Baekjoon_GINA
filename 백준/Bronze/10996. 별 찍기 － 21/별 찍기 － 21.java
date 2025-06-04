import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        if(n==1){
            System.out.print("*");
            return;
        }
        int lm=2*n;
        boolean bl=true,ck=n%2==0;
        for(int i=0;i<lm;i++){
            for(int j=0;j<n;j++){
                if(bl==true){
                    as.append('*');
                }else{
                    as.append(' ');
                }
                bl=!bl;
            }
            if(ck) bl=!bl;
            as.append('\n');
        }
        System.out.print(as);
    }
}