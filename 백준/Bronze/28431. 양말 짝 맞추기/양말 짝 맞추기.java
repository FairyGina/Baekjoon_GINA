import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int[] s=new int[5];
        L:for(int i=0;i<5;i++){
            int n=Integer.parseInt(I.readLine());
            for(int j=0;j<i;j++){
                if(n==s[j]){
                    s[j]=0;
                    continue L;
                }
            }
            s[i]=n;
        }
        O.write(s[0]+s[1]+s[2]+s[3]+s[4]+"\n");
        O.flush();
    }
}