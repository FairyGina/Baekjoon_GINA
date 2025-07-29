import java.util.*;
import java.io.*;
class Main{
    static int[][] board=new int[21][21];
    static int[] my={0,1,1,-1},mx={1,0,1,1};
    static int asy,asx;
    static boolean om(int nb){
        for(int row=0;row<21;row++){
            for(int col=0;col<21;col++){
                L: for(int m=0;m<4;m++){
                    if(board[row][col]==nb) continue;
                    int r,c;
                    for(int i=1;i<6;i++){
                        r=row+i*my[m]; c=col+i*mx[m];
                        if(r<0||r>=21||c<0||c>=21||board[r][c]!=nb) continue L;
                    }
                    r=row+6*my[m]; c=col+6*mx[m];
                    if(r<0||r>=21||c<0||c>=21||board[r][c]!=nb){
                        asy=row+my[m]; asx=col+mx[m];
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        for(int[] b:board){
            Arrays.fill(b,-1);
        }
        for(int i=1;i<20;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=1;j<20;j++){
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        String as="";
        if(om(1)) as=String.format("1\n%d %d",asy,asx);
        else if(om(2)) as=String.format("2\n%d %d",asy,asx);
        else as="0";

        System.out.print(as);
    }
}