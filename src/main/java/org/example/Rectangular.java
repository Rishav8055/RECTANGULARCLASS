package org.example;

public class Rectangular {
    double height;
    double width;

    Rectangular(){
        height=1;
        width=1;
        System.out.println("Rectangular height = "+this.height+ "width  = "+this.width);
    }

    public Rectangular(double height, double width) {
        height = height;
        width = width;
        System.out.println("Rectangular height = "+this.height+ "width  = "+this.width);
    }
    double getArea(){
        double rectangularArea=height*width;
        return rectangularArea;

    }
    double getPerimeter(){
        double rectangularPerimeter= 2*(height+width);
        return rectangularPerimeter;
    }
}
