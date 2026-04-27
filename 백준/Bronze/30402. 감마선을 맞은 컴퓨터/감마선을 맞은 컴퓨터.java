import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<15;i++){
            String s=I.readLine();
            for(int j=0;j<30;j+=2){
                char c=s.charAt(j);
                if(c=='w'){
                    System.out.print("chunbae");
                    return;
                }else if(c=='b'){
                    System.out.print("nabi");
                    return;
                }else if(c=='g'){
                    System.out.print("yeongcheol");
                    return;
                }
            }
        }
    }
}
