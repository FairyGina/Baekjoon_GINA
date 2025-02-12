import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(b.readLine());
        while(t-->0){
            int r=0;
            String q=b.readLine(), p=b.readLine();
            for(int i=0;i<q.length();i++) r+=q.charAt(i)^p.charAt(i);
            System.out.printf("Hamming distance is %d.%n",r);
        }
    }
}