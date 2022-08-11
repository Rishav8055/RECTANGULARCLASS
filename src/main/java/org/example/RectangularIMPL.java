package org.example;

public class RectangularIMPL {
    public static void main(String[] args) {
        Rectangular rectangular1 = new Rectangular();
        System.out.println("Rectangular Area is  =  "+rectangular1.getArea());
        System.out.println("perimeter        is  =  "+rectangular1.getPerimeter());


        Rectangular rectangular2 = new Rectangular(40,4);
        System.out.println("Rectangular Area is  =  "+rectangular2.getArea());
        System.out.println("perimeter        is  =  "+rectangular2.getPerimeter());


        Rectangular rectangular3 = new Rectangular(35.9,3.5);
        System.out.println("Rectangular Area is  =  "+rectangular3.getArea());
        System.out.println("perimeter        is  =  "+rectangular3.getPerimeter());


    }
}