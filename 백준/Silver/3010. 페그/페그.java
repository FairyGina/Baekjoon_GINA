import java.io.*;
class Main{
    static int r=0;
    public static void q(String s){
        for(int j=0;j<5;j++){
            String t=s.substring(j,j+3);
            if(t.equals("oo.")||t.equals(".oo")){
                r++;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String[] s=new String[7];
        for(int i=0;i<7;i++){
            s[i]=I.readLine();
        }
        for(int i=0;i<7;i++){
            q(s[i]);
            StringBuilder s1=new StringBuilder();
            for(int j=0;j<7;j++){
                s1.append(s[j].charAt(i));
            }
            q(s1.toString());
        }
        System.out.println(r);
    }
}