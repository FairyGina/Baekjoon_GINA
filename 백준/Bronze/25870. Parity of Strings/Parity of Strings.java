import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int ap[]=new int[26];
        String s=I.readLine();
        for(int i=0;i<s.length();i++) ap[s.charAt(i)-'a']++;
        boolean o=false,e=false;
        for(int i=0;i<26;i++){
            if(ap[i]==0) continue;
            else if(!o&&ap[i]%2==1) o=true;
            else if(!e&&ap[i]%2==0) e=true;
        }
        ap[0]=0;
        if(o){
            ap[0]++;
            if(e) ap[0]++; 
        }
        O.write(ap[0]+"\n");
        O.flush();
    }
}