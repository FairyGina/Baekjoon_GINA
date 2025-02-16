import java.io.*; 
import java.util.*; 
class Main{ 
    public static void main(String[] args) throws Exception{ 
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out)); 
        StringTokenizer s=new StringTokenizer(I.readLine()); 
        int n=Integer.parseInt(s.nextToken())+1,m=Integer.parseInt(s.nextToken()); 
        boolean[] bx=new boolean[n], by=new boolean[n]; 
        int[] ip=new int[3]; 
        while(m-->0){ 
            s=new StringTokenizer(I.readLine()); 
            for (int i=0;i<3;i++) ip[i]=Integer.parseInt(s.nextToken()); 
            switch(ip[2]){ 
                case 1: case 2: case 8: Arrays.fill(bx, ip[0], n, true); break; 
                case 4: case 5: case 6: Arrays.fill(bx, 1, ip[0], true); break; 
                case 3: case 7: Arrays.fill(bx, true); bx[ip[0]]=false; break; 
            } 
            switch(ip[2]){ 
                case 6: case 7: case 8: Arrays.fill(by, ip[1], n, true); break; 
                case 2: case 3: case 4: Arrays.fill(by, 1, ip[1], true); break; 
                case 1: case 5: Arrays.fill(by, true); by[ip[1]]=false; break; 
            } 
        } 
        m=n; 
        while(n-->1){ if(!bx[n]) { O.write(n+" "); break; } } 
        while(m-->1){ if(!by[m]) { O.write(m+"\n"); O.flush(); break; } } 
    } 
}