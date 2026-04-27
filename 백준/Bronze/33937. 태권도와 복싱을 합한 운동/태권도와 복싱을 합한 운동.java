import java.io.*;
class Main{
    static char[] ap={'a','e','i','o','u'};
    static StringBuilder sb=new StringBuilder();
    static int strmk(String s){
        int id=-1,lm=s.length();
        boolean bl=false;
        L:for(int i=0;i<lm;i++){
            for(int j=0;j<5;j++){
                if(s.charAt(i)==ap[j]){
                    id=i;
                    bl=true;
                    break;
                }else if(j==4&&bl==true) break L;
            }
        }
        if(id<0||id==lm-1) System.out.print("no such exercise");
        else sb.append(s.substring(0, id+1));
        return id;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        String s1=I.readLine();
        String s2=I.readLine();

        int id=strmk(s1);
        if(id<0||id==s1.length()-1) return;
        id=strmk(s2);
        if(id<0||id==s2.length()-1) return;
        System.out.print(sb);
    }
}