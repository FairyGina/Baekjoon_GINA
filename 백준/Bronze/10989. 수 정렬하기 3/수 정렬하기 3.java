import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        int[] num=new int[10001];
        for(int i=0;i<n;i++){
            int t=Integer.parseInt(I.readLine());
            num[t]++;
        }
        for(int i=0;i<10001;i++) for(int j=0;j<num[i];j++) O.write(i+"\n");
        O.flush();
    }
}