import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder s;
        while(!(s=new StringBuilder(I.readLine())).toString().equals("#")){
            int l=s.length()-1,r=0;
            for(int i=0;i<l;i++) r+=s.charAt(i)-'0';
            boolean b=false,d=false;
            if(s.charAt(l)=='e') b=true;
            if(r%2==0) d=true;
            s.setCharAt(l,(b^d) ?'1':'0');
            O.write(s.toString()+"\n");
        }
        O.flush();
    }
}