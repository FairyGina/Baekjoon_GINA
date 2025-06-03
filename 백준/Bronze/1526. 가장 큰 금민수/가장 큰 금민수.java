import java.io.*;
class Main{
    static boolean sc(String s){
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)!='4'&&s.charAt(i)!='7') return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        while(n>3){
            String s=String.valueOf(n);
            if(sc(s)){
                System.out.print(n);
                break;
            }
            n--;
        }
    }
}