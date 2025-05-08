import java.io.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());

        String[] tri=new String[10];
        tri[0]="1\n";
        tri[1]="1 1\n";
        tri[2]="1 2 1\n";
        tri[3]="1 3 3 1\n";
        tri[4]="1 4 6 4 1\n";
        tri[5]="1 5 10 10 5 1\n";
        tri[6]="1 6 15 20 15 6 1\n";
        tri[7]="1 7 21 35 35 21 7 1\n";
        tri[8]="1 8 28 56 70 56 28 8 1\n";
        tri[9]="1 9 36 84 126 126 84 36 9 1\n";

        for(int ti=1;ti<=t;ti++){
            as.append('#').append(ti).append('\n');
            int n=Integer.parseInt(I.readLine());
            for(int i=0;i<n;i++){
                as.append(tri[i]);
            }
        }
        
        System.out.println(as);
    }
}