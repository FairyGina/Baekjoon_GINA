import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        String s=I.readLine();
        int l=s.length()-3,r=0;
        for(int i=0;i<l;i++){
            String t=s.substring(i,i+4);
            if(t.equals("DKSH")) r++;
        }
        System.out.print(r);
    }
}