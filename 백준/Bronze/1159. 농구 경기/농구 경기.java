import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] ap=new int[26];
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            String s=I.readLine();
            ap[s.charAt(0)-97]++;
        }
        for(int i=0;i<26;i++){
            if(ap[i]>4)
                as.append((char)(i+97));
        }
        if(as.length()==0) as.append("PREDAJA");
        System.out.print(as);
    }
}