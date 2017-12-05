package com.company.triangle;

public class Main {

    public static void main(String[] args) {
        simpleStar();
        drawLine();
        horizontalLine(8);
        drawLine();
        verticalLine(3);
        drawLine();
        rightTriangle(3);
        drawLine();

    }

    private static void drawLine() {
        System.out.println("--------------------------------");
    }

    public static void simpleStar() {
        horizontalLine(1);
    }

    public static void horizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void verticalLine(int n) {
        for (int i = 0; i < n; i++) {
            simpleStar();
        }
    }

    public static void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            horizontalLine(i+1);
        }
    }

}
