import java.io.*;
class Main{
    static String s;
    static int[] apA=new int[26];
    static void pd(int l,int r){
        if(l<r){
            char a=s.charAt(l),b=s.charAt(r);
            if(a!=b){
                apA[a-97]++;
                apA[b-97]++;
            }
            pd(++l,--r);
        }
    }
    static boolean ft(){
        for(int i=0;i<26;i++){
            if(apA[i]%2!=0) return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int l=Integer.parseInt(I.readLine())-1;
        s=I.readLine();
        pd(0,l);

        System.out.println(ft()?"Yes":"No");
    }
}