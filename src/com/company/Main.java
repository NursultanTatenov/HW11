package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();

        System.out.print("To find area of triangle write side a: ");
        triangle.a= scanner.nextInt();
        System.out.print("Write side b: ");
        triangle.b= scanner.nextInt();
        System.out.print("Write side c: ");
        triangle.c=scanner.nextInt();

        System.out.println("         .          ");
        System.out.println("        / \\        ");
        System.out.println(" a="+triangle.a+" /   \\ b="+triangle.b+" ");
        System.out.println("      /_____\\      ");
        System.out.println("        c="+triangle.c);

        System.out.println("Using the Herons formula to find the area of a triangle ");

     triangle.areaTriangle(triangle.a, triangle.b, triangle.c);

	// write your code here
    }
}
