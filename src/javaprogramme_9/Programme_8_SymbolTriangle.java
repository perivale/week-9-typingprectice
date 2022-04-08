package javaprogramme_9;

import java.util.Scanner;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {
    public static void SymbolTriangle(int n) {
        for ( int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("@");
                System.out.println(" ");

            }
        }
    }

    public static void main(String[] args) {
        //scaneer declearation for rading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of rows");
        SymbolTriangle(scanner.nextInt());
        //closeing the scaneer
        scanner.close();
    }
}