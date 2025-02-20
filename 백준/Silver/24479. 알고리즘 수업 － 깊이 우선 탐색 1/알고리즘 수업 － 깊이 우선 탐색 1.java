import java.io.*;
import java.util.*;
class Main{
    static BufferedReader I = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter O = new BufferedWriter(new OutputStreamWriter(System.out));
    static int v;
    static boolean[] visited;
    static int[] dt;
    public static void dfs(ArrayList<ArrayList<Integer>> e, int r) throws Exception {
        v++;
        visited[r] = true;
        dt[r] = v;
        for (int i : e.get(r)) {
            if (!visited[i]) {
                dfs(e, i);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        StringTokenizer s = new StringTokenizer(I.readLine());
        int n = Integer.parseInt(s.nextToken()) + 1, m = Integer.parseInt(s.nextToken()), r = Integer.parseInt(s.nextToken());
        ArrayList<ArrayList<Integer>> e = new ArrayList<>();
        visited = new boolean[n];
        dt = new int[n];
        for (int i = 0; i < n; i++) e.add(new ArrayList<>());
        while (m-- > 0) {
            s = new StringTokenizer(I.readLine());
            int u = Integer.parseInt(s.nextToken()), v = Integer.parseInt(s.nextToken());
            e.get(u).add(v);
            e.get(v).add(u);
        }
        for (ArrayList<Integer> row : e) Collections.sort(row);
        dfs(e, r);
        for (int i = 1; i < n; i++) O.write(dt[i] + "\n");
        O.flush();
    }
}