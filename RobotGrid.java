import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RobotGrid {
    // Placeholder code for the main implementation class

    public static boolean isSafe(int x, int y) {
        // TODO: Add implementation logic here
        int product = x * y;
        int sum = 0;
        product = Math.abs(product); // handle the negative values

        while (product != 0) {
            sum += product % 10;
            product /= 10;
        }
        int MINE_VALUE = 19;
        return sum < MINE_VALUE;
    }

    public static int totalSafeSquares() {
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited.add("0,0");

        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };

        int safeCount = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            if (!isSafe(x, y)) continue;

            safeCount++;

            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];
                String key = newX + "," + newY;
                if (!visited.contains(key)) {
                    visited.add(key);
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        return safeCount;
    }

    static class Node {
        int x, y, distance;
        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public static int shortestSafeJourney(int a, int b, int x, int y) {
        Set<String> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x, y, 0));
        visited.add(x + "," + y);

        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int cx = current.x;
            int cy = current.y;
            int dist = current.distance;

            if (cx == a && cy == b) {
                return dist;
            }

            for (int[] dir : directions) {
                int newX = cx + dir[0];
                int newY = cy + dir[1];
                String key = newX + "," + newY;

                if (!visited.contains(key) && isSafe(newX, newY)) {
                    visited.add(key);
                    queue.offer(new Node(newX, newY, dist + 1));
                }
            }
        }

        // If there's no safe path
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(isSafe(3,4));
        System.out.println(totalSafeSquares());
        System.out.println(shortestSafeJourney(0,0,5,5));

    }
}
