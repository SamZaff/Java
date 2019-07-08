/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class Circle {
    double radius;
    Circle() {
        
    }
    Circle(double newRadius) {
        radius = newRadius;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double newRad) {
        this.radius = newRad;
    }
    double getCircumference() {
        return radius * 2 * Math.PI;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Circle T = new Circle(3);
        System.out.println(T.getArea());
        System.out.println(T.getCircumference());
}
}
