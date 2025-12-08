import java.util.*;

public class LOL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 读取换行符

        for (int i = 0; i < n; i++) {
            String situation = scanner.nextLine();
            int result = solve(situation);
            System.out.println(result);
        }
        scanner.close();
    }

    // 判断当前局面是否有"LOL"出现
    private static boolean hasLOL(String s) {
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'L') {
                return true;
            }
        }
        return false;
    }

    // 解决单个局面
    private static int solve(String stua) {
        // 如果已经有LOL，说明上一个玩家赢了，当前玩家输了
        if (hasLOL(stua)) {
            return -1; // 当前玩家输了
        }

        // 如果没有空格了，平局
        if (!stua.contains("*")) {
            return 0;
        }

        boolean win = false;
        boolean Draw = false;

        // 尝试在每个空格填L或O
        for (int i = 0; i < stua.length(); i++) {
            if (stua.charAt(i) == '*') {
                // 尝试填L
                char[] chars = stua.toCharArray();
                chars[i] = 'L';
                String newStua = new String(chars);

                // 如果填L后立即形成LOL，则当前玩家赢
                if (hasLOL(newStua)) {
                    win = true;
                } else {
                    // 否则对手行动，递归判断
                    int opponentResult = solve(newStua);
                    if (opponentResult == -1) {
                        // 对手输了，说明我们赢了
                        win = true;
                    } else if (opponentResult == 0) {
                        // 对手平局，我们可能平局
                        Draw = true;
                    }
                }

                // 尝试填O
                chars = stua.toCharArray();
                chars[i] = 'O';
                newStua = new String(chars);

                // 如果填O后立即形成LOL，则当前玩家赢
                if (hasLOL(newStua)) {
                    win = true;
                } else {
                    // 否则对手行动，递归判断
                    int opponentResult = solve(newStua);
                    if (opponentResult == -1) {
                        // 对手输了，说明我们赢了
                        win = true;
                    } else if (opponentResult == 0) {
                        // 对手平局，我们可能平局
                        Draw = true;
                    }
                }
            }
        }

        if (win) {
            return 1; // 能赢
        } else if (Draw) {
            return 0; // 平局
        } else {
            return -1; // 必输
        }
    }
}