import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        String s1=I.readLine(),s2=I.readLine();
        if(n%2!=0){
            int l=s1.length();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<l;i++){
                if(s1.charAt(i)=='0') sb.append(1);
                else sb.append(0);
            }
            s1=String.valueOf(sb);
        }
        System.out.print(s1.equals(s2)?"Deletion succeeded":"Deletion failed");
    }
}