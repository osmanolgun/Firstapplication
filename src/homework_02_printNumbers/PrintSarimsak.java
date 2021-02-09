package homework_02_printNumbers;
import java.util.Scanner;
public class PrintSarimsak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a chracter :");
        String strChar = input.next();
        System.out.print("please enter the student number :");
        int number = input.nextInt();
        String numDigits = String.valueOf(number);
        for(int i = 0; i < numDigits.length(); ++i) {
            print(strChar, Integer.parseInt(numDigits.substring(i, i + 1)));
        }
    }
    public static void print(String x, int y) {
        for(int k = 0; k < 5; ++k) {
            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < 3; ++j) {
                    if (y == 0) {
                        if ((k == 1 || k == 2 || k == 3) && j == 1) {
                            System.out.print("  ");
                        } else {
                            System.out.print(x + x);
                        }
                    } else if (y == 1) {
                        if (j != 0 && j != 1) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 2) {
                        if ((k != 1 || j != 0 && j != 1) && (k != 3 || j != 1 && j != 2)) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 3) {
                        if (k != 1 && k != 3 || j != 0 && j != 1) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 4) {
                        if ((k != 0 && k != 1 || j != 1) && (k != 3 && k != 4 || j != 0 && j != 1)) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 5) {
                        if ((k != 1 || j != 1 && j != 2) && (k != 3 || j != 0 && j != 1)) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 6) {
                        if ((k != 1 || j != 1 && j != 2) && (k != 3 || j != 1)) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 7) {
                        if (k != 1 && k != 2 && k != 3 && k != 4 || j != 0 && j != 1) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    } else if (y == 8) {
                        if ((k == 1 || k == 3) && j == 1) {
                            System.out.print("  ");
                        } else {
                            System.out.print(x + x);
                        }
                    } else if (y == 9) {
                        if ((k != 1 || j != 1) && (k != 3 || j != 0 && j != 1)) {
                            System.out.print(x + x);
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}