/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */

import java.util.Scanner;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point p1, Point p2) {
        double X = p1.x - p2.x;
        double Y = p1.y - p2.y;
        return Math.sqrt(X * X + Y * Y);
    }

    public double distance(Point p) {
        double X = p.x - this.x;
        double Y = p.y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }

    @Override
    public String toString() {
        return (x + " " + y);
    }
}

public class J04001 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int tTest = Integer.parseInt(buf.next());
        while (tTest-- > 0) {
            Point p1 = new Point(buf.nextDouble(), buf.nextDouble());
            Point p2 = new Point(buf.nextDouble(), buf.nextDouble());
            System.out.printf("%.4f\n", p1.distance(p2));
        }
        buf.close();
    }
}
