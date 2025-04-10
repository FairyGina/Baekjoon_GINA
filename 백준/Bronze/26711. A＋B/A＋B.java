import java.io.*;
class Main{
    static StringBuilder a=new StringBuilder();
    public static void add(String s1,String s2){
        int la=s1.length(),lb=s2.length(),m=0;
        if(la>lb){
            m=la;
            String t=String.format("%"+m+"s",s2).replace(' ','0');
            s2=t;
        } else{
            m=lb;
            String t=String.format("%"+m+"s",s1).replace(' ','0');
            s1=t;
        }
        boolean e=false;
        m--;
        for(int i=m;i>-1;i--){
            int t=s1.charAt(i)-'0'+(s2.charAt(i)-'0')+(e==true?1:0);
            a.append(t%10);
            e=t/10>0;
        }
        if(e==true)a.append(1);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        String s1=I.readLine(),s2=I.readLine();
        add(s1,s2);
        O.write(a.reverse()+"\n");
        O.flush();
    }
}