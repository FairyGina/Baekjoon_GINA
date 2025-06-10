import java.io.*;
import java.util.*;
class Main{
    static char[] a,b;
    static void ch(char[] arr,char c,char tc){
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]==c){
                arr[i]=tc;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());

        String s=st.nextToken();
        int len=s.length();
        a=new char[len];
        for(int i=0;i<len;i++){
            a[i]=s.charAt(i);
        }
        s=st.nextToken();
        len=s.length();
        b=new char[len];
        for(int i=0;i<len;i++){
            b[i]=s.charAt(i);
        }
        ch(a,'6','5');
        ch(b,'6','5');
        len=Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b));
        System.out.print(len+" ");

        ch(a,'5','6');
        ch(b,'5','6');
        len=Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b));
        System.out.print(len);
    }
}