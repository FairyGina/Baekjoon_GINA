import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int num=0,max=0,id=0;;
        int[] ct=new int[1001];
        for(int i=0;i<10;i++){
            int n=Integer.parseInt(I.readLine());
            num+=n;
            ct[n]++;
            if(ct[n]>max){
                max=ct[n];
                id=n;
            }
        }
        System.out.print(num/10+"\n"+id);
    }
}