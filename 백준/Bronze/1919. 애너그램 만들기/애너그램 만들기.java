import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int[] ap=new int[123],bp=new int[123];
        
        String s=I.readLine();
        int len=s.length();
        for(int i=0;i<len;i++){
            ap[s.charAt(i)]++;
        }
        s=I.readLine();
        len=s.length();
        for(int i=0;i<len;i++){
            bp[s.charAt(i)]++;
        }
        len=0;
        for(int i=97;i<123;i++){
            len+=Math.abs(ap[i]-bp[i]);
        }
        System.out.print(len);
    }
}