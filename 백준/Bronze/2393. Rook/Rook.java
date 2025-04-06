import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder a=new StringBuilder();

        a.append("  ___  ___  ___\n");
        a.append("  | |__| |__| |\n");
        a.append("  |           |\n");
        a.append("   \\_________/\n");
        a.append("    \\_______/\n");
        a.append("     |     |\n");
        a.append("     |     |\n");
        a.append("     |     |\n");
        a.append("     |     |\n");
        a.append("     |_____|\n");
        a.append("  __/       \\__\n");
        a.append(" /             \\\n");
        a.append("/_______________\\\n");

        O.write(a+"\n");
        O.flush();
    }
}