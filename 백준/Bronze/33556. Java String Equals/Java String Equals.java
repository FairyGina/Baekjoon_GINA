import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        String A=I.readLine(),B=I.readLine();
        if ("null".equals(A)) {
            A=null;
        }
        if ("null".equals(B)) {
            B=null;
        }
        try {
            O.write(String.valueOf(A.equals(B)));
        } catch (NullPointerException e) {
            O.write("NullPointerException");
        }
        O.write("\n");
        try {
            O.write(String.valueOf(A.equalsIgnoreCase(B)));
        } catch (NullPointerException e) {
            O.write("NullPointerException");
        }
        O.flush();
    }
}