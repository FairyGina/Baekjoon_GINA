import java.io.*;
import java.util.*;
class Solution{
    static char[][] board=new char[8][8];
    static int len,mid=0;
    static boolean odd=true;

    static boolean pd1(int fix,int start){
        Stack<Character> st=new Stack<>();
        int last=start+len,alen=start+mid;
        while(start<alen){
            st.push(board[fix][start++]);
        }
        if(odd) start++;
        while(start<last){
            if(st.pop()!=board[fix][start++]) return false;
        }
        return true;
    }

    static boolean pd2(int fix,int start){
        Stack<Character> st=new Stack<>();
        int last=start+len,alen=start+mid;
        while(start<alen){
            st.push(board[start++][fix]);
        }
        if(odd) start++;
        while(start<last){
            if(st.pop()!=board[start++][fix]) return false;
        }
        return true;
    }

    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        for(int t=1;t<=10;t++){
            len=Integer.parseInt(I.readLine());
            mid=len/2;
            odd=len%2!=0;

            for(int i=0;i<8;i++){ //보드판 입력받기
                String ip=I.readLine();
                for(int j=0;j<8;j++){
                    board[i][j]=ip.charAt(j);
                }
            }

            int res=0,fix=7,last=8-len;
            while(fix>-1){
                for(int i=0;i<=last;i++){
                    if(pd1(fix,i)) res++;
                }
                fix--;
            }
            fix++;
            while(fix<8){
                for(int i=0;i<=last;i++){
                    if(pd2(fix,i)) res++;
                }
                fix++;
            }
            as.append('#').append(t).append(' ').append(res).append('\n');
        }
        System.out.print(as);
    }
}