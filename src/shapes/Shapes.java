/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Colin
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testShapes();
        testRectangle();
        testTriangle();
    }

    private static void testShapes() {
        Circle myCircle = new Circle(5.5);
//        myCircle.setRadius(5.5);

        System.out.println("Circle information");
        System.out.printf("  radius        =%.2f \n", myCircle.getRadius());
        System.out.printf("  area          =%.14f \n", myCircle.getArea());
        System.out.printf("  circumference =%.14f \n", myCircle.getCircumference());
        System.out.printf("  diameter      =%.2f \n", myCircle.getDiameter());
    }

    private static void testRectangle() {
        Rectangle myRectangle = new Rectangle(7.5, 5.5);
//        myRectangle.setWidth(7.5);
//        myRectangle.setLength(5.5);

        System.out.println("Rectangle information");
        System.out.printf("  Width     =%.2f\n", myRectangle.getWidth());
        System.out.printf("  Length    =%.2f\n", myRectangle.getLength());
        System.out.printf("  Area      =%.2f\n", myRectangle.getArea());
        System.out.printf("  Perimeter =%.2f\n", myRectangle.getPerimeter());
    }

    private static void testTriangle() {
        Triangle myTriangle = new Triangle (5.5, 4.5);
        
        System.out.println("Triangle Information");
        System.out.printf(" Base    =%.2f\n", myTriangle.getbase());
        System.out.printf(" Height  =%.2f\n", myTriangle.getheight());
        System.out.printf(" Area    =%.3f\n", myTriangle.getArea());
    }

}
