package org.waspec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printTriangleType(1,3,2);
        }

    public static void printTriangleType (int a, int b, int c){
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if ((a == b && b != c) || (a==c && b != c) || (b==c && a!=c)) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}

