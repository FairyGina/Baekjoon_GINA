import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder b=new StringBuilder();
        String s=I.readLine();
        int[] n=new int[10];
        for(int i=0;i<s.length();i++) n[s.charAt(i)-'0']++;
        for(int i=9;i>-1;i--) for(int j=0;j<n[i];j++) b.append(i);
        O.write(b+"\n");
        O.flush();
    }
}