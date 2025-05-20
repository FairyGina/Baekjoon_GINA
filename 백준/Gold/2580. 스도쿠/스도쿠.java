import java.io.*;
import java.util.*;
class Main{
    static boolean bl=false;
    static int[][] sudoku=new int[9][9];
    static int[][] zero;
    static boolean[][] row=new boolean[9][10],col=new boolean[9][10],pan=new boolean[9][10];
    static int zc;
    static StringBuilder as;
    static void check(int y,int x,int p,int id){
        for(int i=0;i<9;i++){
            row[y][sudoku[y][i]]=true;
        }
        for(int i=0;i<9;i++){
            col[x][sudoku[i][x]]=true;
        }
        int yc=y/3*3,yq=yc+3;
        int xc=x/3*3,xq=xc+3; 
        for(int i=yc;i<yq;i++){
            for(int j=xc;j<xq;j++){
                pan[p][sudoku[i][j]]=true;
            }
        }
    }
    static void dfs(int dt){
        if(bl) return;
        if(dt==zc){
            bl=true;
            for(int[] i:sudoku){
                for(int j:i){
                    as.append(j).append(' ');
                }
                as.append("\n");
            }
            return;
        }
        int y=zero[dt][0],x=zero[dt][1],p=zero[dt][2];
        for(int i=1;i<=9;i++){
            if(!row[y][i]&&!col[x][i]&&!pan[p][i]){
                row[y][i]=col[x][i]=pan[p][i]=true;
                sudoku[y][x]=i;
                dfs(dt+1);
                sudoku[y][x]=0;
                row[y][i]=col[x][i]=pan[p][i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        as=new StringBuilder();

        for(int i=0;i<9;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=0;j<9;j++){
                sudoku[i][j]=Integer.parseInt(st.nextToken());
                if(sudoku[i][j]==0) zc++;
            }
        }
        zero=new int[zc][3];
        int id=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(sudoku[i][j]==0){
                    zero[id][0]=i;
                    zero[id][1]=j;
                    zero[id][2]=i/3*3+j/3;
                    check(i,j,zero[id][2],id);
                    id++;
                }
            }
        }
        dfs(0);
        System.out.print(as);
    }
}