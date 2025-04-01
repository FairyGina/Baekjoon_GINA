import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder a=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        for(int i=1;i<=n;i++){
            if(i%2==0) a.append("2 ");
            else a.append("1 ");
        }
        if(n%2!=0){
            a.delete(a.length()-2,a.length());
            a.append("3");
        }
        O.write(a+"\n");
        O.flush();
    }
}