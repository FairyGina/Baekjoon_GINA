import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0,p=3;i<3;i++,p--){
            String s=I.readLine();
            if(s.charAt(0)=='F'||s.charAt(0)=='B') continue;
            int n=Integer.parseInt(s)+p;
            if(n%3==0){
                if(n%5==0) s="FizzBuzz";
                else s="Fizz";
            }else if(n%5==0) s="Buzz";
            else s=String.valueOf(n);
            System.out.print(s);
            break;
        }
    }
}