import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine()),min=1,max=3,p=3,s=1;
        while(n>max){ 
            s+=2;
            p+=4;
            min=max+1;
            max+=p;
        }
        int m=(min+max)/2;
        p=1;
        if(n<m){
            for(int i=min;i<n;i++,s--,p++){}
            O.write(s+"/"+p+"\n");
        }else{
            s++;
            for(int i=m;i<n;i++,p++,s--){}
            O.write(p+"/"+s+"\n");
        }
        O.flush();
    }
}