package 순열;

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
        per(0);
    }

    static void per(int cnt) {
        // 일반 순열
        if (cnt == R) {
            System.out.println(Arrays.toString(choice));
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                choice[cnt] = arr[i];
                per(cnt + 1);
                visited[i] = false;
            }
        }
    }

    static void per2(int cnt) {
        // 중복 순열
        if (cnt == R) {
            System.out.println(Arrays.toString(choice));
            return;
        }

        for (int i = 0; i < N; i++) {
                choice[cnt] = arr[i];
                per(cnt + 1);

        }
    }
}
