import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        char[] ap=new char['Z'+1];
        while(t-->0){
            String str=I.readLine(),ts=I.readLine();
            int id=0;
            for(char c='A';c<='Z';c++){
                ap[c]=ts.charAt(id++);
            }
            id=str.length();
            char[] cs=new char[id+1];
            cs[id]='\n';
            for(int i=0;i<id;i++){
                int tp=str.charAt(i);
                if(tp!=32){
                    cs[i]=ap[tp];
                }
                else cs[i]=' ';
            }
            as.append(cs);
        }
        System.out.print(as);
    }
}