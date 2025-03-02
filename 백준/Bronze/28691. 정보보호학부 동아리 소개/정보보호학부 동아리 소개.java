import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=I.readLine().charAt(0)-'A';
        switch(n){
            case 0:
                O.write("AlKor");
                break;
            case 2:
                O.write("CyKor");
                break;
            case 12:
                O.write("MatKor");
                break;
            case 22:
                O.write("WiCys");
                break;
            default:
                O.write("$clear");
        }
        O.write("\n");
        O.flush();
    }
}