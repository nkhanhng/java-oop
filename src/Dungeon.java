import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int m = 6;
        int n = 7;

        int px = 1;
        int py = 1;

        int ey = 5;
        int ex = 6;

        int kx = 1;
        int ky = 4;

        int wx = 1;
        int wy = 3;

        int vx = 0;
        int vy = 0;

        boolean hasKey = false;

        while (true) {
            //view
            for (int y = 0; y < m; y++) {
                for (int x = 0; x < n; x++) {
                    if (y == py && x == px) {
                        System.out.print("P ");
                    }
                    else if (x == ex && y == ey){
                        System.out.print("E ");
                    }
                    else if (x == kx && y == ky && !hasKey){
                        System.out.print("K ");
                    }
                    else if (x == wx && y == wy){
                        System.out.print("W ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
                System.out.print("\n");
            }

            //ask for move
            System.out.print("Your move");
            String move = keyboardScanner.next();

            vx = 0;
            vy = 0;

            if (move.equalsIgnoreCase("W")){
                vy = -1;
            }
            else if (move.equalsIgnoreCase("S")){
                vy = 1;
            }
            else if (move.equalsIgnoreCase("A")){
                vx = -1;
            }
            else if (move.equalsIgnoreCase("D")){
                vx = 1;
            }

            int nextX = px + vx;
            int nextY = py + vy;

            if (nextY < 0) py = 0;
            if (nextY >= m) py = m - 1;

            if (nextX < 0) px = 0;
            if (nextX >= n) px = n - 1;

            if (nextX == kx && nextY == ky){
                hasKey = true;
                System.out.println("You've picked up the key");
            }

            if (nextX == wx && nextY == wy){
                nextX = px;
                nextY = py;
            }

            px = nextX;
            py = nextY;

            if (px == ex && py == ey){
                if (hasKey) {
                    System.out.println("You won");
                    break;
                }
                else {
                    System.out.println("Get the key first");
                }
            }
        }
    }
}
