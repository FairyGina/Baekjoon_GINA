import java.io.*;
class Main{
    static int a;
    public static int recursion(char[] s, int l, int r){
        a++; //콜 횟수
        if(l>=r) return 1;
        else if(s[l]!=s[r]) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int IsPalindrome(char[] s){
        return recursion(s,0,s.length-1);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            a=0;
            String c=I.readLine();
            char[] s=c.toCharArray();
            O.write(IsPalindrome(s)+" "+a+"\n");        
        }
        O.flush();
    }
}