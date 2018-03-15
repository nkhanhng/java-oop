import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
//        System.out.print("Enter a number:");
//
//        System.out.print("Enter n:");
//        int n = keyboardScanner.nextInt();

        int m = 5;
        int n = 4;

        int x = 3;
        int y = 2;

        int ex = 4;
        int ey = 3;
//        System.out.print("Enter m:");
//        int m = keyboardScanner.nextInt();
        while (true) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == y && j == x) {
                        System.out.print("P");
                    }

                    else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
        }
    }

}

