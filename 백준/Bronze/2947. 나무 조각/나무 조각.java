import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s=I.readLine();
        char[] arr=new char[10];
        for(int i=0;i<9;i+=2){
            arr[i]=s.charAt(i);
            arr[i+1]=' ';
        }
        for(int t=0;t<4;t++){
            int lm=7-t*2;
            for(int i=0;i<lm;i+=2){
                if(arr[i]>arr[i+2]){
                    char c=arr[i];
                    arr[i]=arr[i+2];
                    arr[i+2]=c;
                    as.append(arr).append('\n');
                }
            }
        }
        System.out.print(as);
    }
}