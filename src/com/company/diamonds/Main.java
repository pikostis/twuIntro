package com.company.diamonds;

public class Main {

    public static void main(String[] args) {
        isoscelesDiamonds(3);
        makeLines();
        diamond(3);
        makeLines();
        diamondName(3);
        makeLines();
    }

    private static void makeLines() {
        System.out.println("--------------------------------");
    }

    public static void upperDiamond(int n) {
        int lastLineStars = n * 2 - 1;
        int spaces = lastLineStars / 2;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void isoscelesDiamonds(int n) {
        upperDiamond(n);
        middleDiamondLine(n);
    }

    private static void middleDiamondLine(int n) {
        int numberOfStars = n * 2 - 1;
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void diamond(int n) {
        upperDiamond(n);
        middleDiamondLine(n);
        lowerDiamond(n);
    }

    public static void lowerDiamond(int n) {

        int extraLines = n - 1;
        int spaces = 1;

        for (int i = extraLines; i > 0 ; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces++;

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void diamondName(int n) {
        upperDiamond(n);
        System.out.println("Con");
        lowerDiamond(n);
    }
}
