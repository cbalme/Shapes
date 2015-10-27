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
public class Rectangle {

   public Rectangle (double length, double width){
       this.length = length;
       this.width = width;
   }
    
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return length + width + length + width;
    }

    public double getArea() {
        return length * width;
    }

}
