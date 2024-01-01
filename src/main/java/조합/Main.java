package 조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N, R;
    static int[] arr, choice;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        R = Integer.parseInt(br.readLine());
        arr = new int[N];
        choice = new int[R];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        comb2(0, 0);

    }

    static void comb(int start, int cnt) {
        // 일반 조합
        if (cnt == R) {
            System.out.println(Arrays.toString(choice));
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                choice[cnt] = arr[i];
                comb(i + 1, cnt + 1);
                visited[i] = false;
            }
        }
    }

    static void comb2(int start, int cnt) {
        // 중복 조합
        if (cnt == R) {
            System.out.println(Arrays.toString(choice));
            return;
        }

        for (int i = start; i < N; i++) {
                choice[cnt] = arr[i];
                comb(i, cnt + 1);

        }
    }
}
