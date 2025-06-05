import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int lt=Integer.parseInt(I.readLine());
            if(lt==1){
                as.append(0).append('\n');
                continue;
            }
            char[] arr=new char[lt];
            if(lt%2==0){
                for(int i=0;i<lt;i++){
                    arr[i]='1';
                }
            }else{
                lt--;
                arr[0]='1';
                arr[lt]='1';
                for(int i=1;i<lt;i++){
                    arr[i]='2';
                }
            }
            as.append(arr).append('\n');
        }
        System.out.print(as);
    }
}