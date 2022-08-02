package mytrianglekevinreid;

import java.util.Scanner;

public class MyTriangleKevinReid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sidea, sideb, sidec, area;

        String type;

        System.out.println("please enter the value of side A");

        sidea = input.nextDouble();
        System.out.println("please enter the value of side B");

        sideb = input.nextDouble();

        System.out.println("please enter the value of side C");

        sidec = input.nextDouble();

        if (isValid(sidea, sideb, sidec)) {
            area = area(sidea, sideb, sidec);
            type = triangleType(sidea, sideb, sidec);
            System.out.printf("Area: %.2f Triangle Type:%20s", area, type);
        }

    }

    public static boolean isValid(double sidea, double sideb, double sidec) {
        if (sidea > 0 && sideb > 0 && sidec > 0) {
            if (sidea + sideb > sidec || sideb + sidec > sidea || sidec + sidea > sideb) {
                return true;
            }
        }
        return false;
    }

    public static double area(double sidea, double sideb, double sidec) {
        double area = 0;
        double p = (sidea + sideb + sidec) / 2;
        area = Math.sqrt(p * (p - sidea) * (p - sideb) * (p - sidec));
        return area;
    }

    public static String triangleType(double a, double b, double c) {
        String type = null;
        if (isValid(a, b, c)) {
            if (a == c) {
                type = " Equilateral";
            } else if (a == b || b == c) {
                type = " Isosceles";
            } else {
                type = " Scalene";
            }
        } else {
            type = " Invalid Triangle";
        }
        return type;
    }
}
