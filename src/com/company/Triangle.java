package com.company;

public class Triangle {
    double a;
    double b;
    double c;

    public void areaTriangle (double a,double b,double c) {
        double p=(a+b+c)/2; //triangle semiperimetr

        double areaTriangle=Math.sqrt((p*(p-a)*(p-b)*(p-c)));//Herons formula to find area of triangle
        System.out.println("Area="+areaTriangle);

    }

}
