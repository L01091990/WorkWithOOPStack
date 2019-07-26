package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Square;
import info.sjd.model.Treangle;

public class AplicattionRunner {
    String name = "AplicattioRunner class";

    public static void main(String[] args) {
        Circle circle = new Circle ();
        circle.diameter = 3.14;
        circle.radius = 15;


        System.out.println("Diameter of circle is " + circle.diameter + " and square has area " + circle.getArea());

        Square square = new Square();
        square. side = 50;
        System.out.println("Side of square is " + square.side + " and square has area " + square.getArea());


        Treangle treangle = new Treangle ();
        treangle.base = 15.0;
        treangle.height = 10.0;
        System.out.println("Base of treangle is " + treangle.base + " and treangle has area "+ treangle.getArea());







    }











}
