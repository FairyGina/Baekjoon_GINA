import java.io.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter o=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(b.readLine());
        while(t-->0){
            int r=0;
            String q=b.readLine(), p=b.readLine();
            for(int i=0;i<q.length();i++) r+=q.charAt(i)^p.charAt(i);
            o.write("Hamming distance is "+r+".\n");
        }
        o.close();
    }
}