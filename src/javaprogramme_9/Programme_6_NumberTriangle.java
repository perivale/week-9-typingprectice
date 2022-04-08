package javaprogramme_9;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * <p>
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_NumberTriangle {

    public static  void numTriange(int n){
        for (int i=0;i<=n;i++){

            for(int j=0;j<i;j++) {
                System.out.println(j + i);
            }
            System.out.println(" ");
            }
        }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number of rows");
        //calls static mrthod
        numTriange(scanner.nextInt());
        //closing the scanner obj
        scanner.close();
    }

}
