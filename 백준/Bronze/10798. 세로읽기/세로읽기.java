import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] wholeArr = new char[5][15];
        int[] nb=new int[5];
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            char[] lineArr = line.toCharArray();
            for (int j = 0; j < lineArr.length; j++) {
                wholeArr[i][j] = lineArr[j];
            }
            nb[i]=line.length();
        }
        
        for(int i=0;i<15;i++){
            for (int j = 0; j < 5; j++) {
                int slen=nb[j];
                if(slen<=i) continue;
                System.out.print(wholeArr[j][i]);
            }
        }
    }

}