import java.io.*;
class Main{
    public static boolean bf(String s){
        int l=s.length(),t=-1;
        char[] sk=new char[l];
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='[') sk[++t]=']';
            if(c=='(') sk[++t]=')';
            if(!(c==')'||c==']')) continue;
            if(t<0||c!=sk[t]){
                t++;
                return false;
            }
            t--;
        }
        return t<0;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals(".")){
            as.append(bf(s)?"yes":"no").append('\n');
        }
        System.out.println(as);
    }
}