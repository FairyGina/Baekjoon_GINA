import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        long p=1,t=0,i=0;
        while(true){
            i++;
            if(n>p){
                p+=t; t+=6;
            }
            else{
                O.write((n>1?i-1:1)+"\n");
                O.flush();
                break;
            }
        }        
    }
}