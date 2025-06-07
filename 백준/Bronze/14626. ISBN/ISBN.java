import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        int id=1,num=0;
        char c;
        boolean bl=false;
        for(int i=0;i<13;i++){
            c=s.charAt(i);
            if(c=='*'){
                if(bl==true) id=3;
            }else{
                if(bl==true){
                    num+=3*(c-'0');
                }else num+=c-'0';
            }
            bl=!bl;
        }
        num%=10;
        int x=10-num;
        for(int i=1;i<10;i++){
            if(i*id%10==x){
                x=i;
                break;
            }
        }
        System.out.print(x%10);
    }
}