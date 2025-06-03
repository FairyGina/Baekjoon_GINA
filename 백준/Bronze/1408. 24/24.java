import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int[] start=new int[3],cur=new int[3];
        String s=I.readLine();
        String[] ts=s.split(":");
        int sec=-1;
        while(++sec<3){
            cur[sec]=Integer.parseInt(ts[sec]);
        }
        s=I.readLine();
        ts=s.split(":");
        sec=-1;
        while(++sec<3){
            start[sec]=Integer.parseInt(ts[sec]);
        }
        sec=start[2]-cur[2];
        if(sec<0){
            sec+=60;
            cur[1]++;
        }
        int min=start[1]-cur[1];
        if(min<0){
            min+=60;
            cur[0]++;
        }
        int ho=start[0]-cur[0];
        if(ho<0) ho+=24;
        System.out.printf("%02d:%02d:%02d",ho,min,sec);
    }
}