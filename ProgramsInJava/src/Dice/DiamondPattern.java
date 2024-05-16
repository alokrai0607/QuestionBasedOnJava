package Dice;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
           
            System.out.println();
        }

       //for lower part
        for (int i = n - 1; i >= 1; i--) {
            //spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

