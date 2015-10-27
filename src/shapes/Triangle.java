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
public class Triangle {

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    private double base;
    private double height;
            
    public double getbase(){
        return base;
    }
    
    public void setbase(double base){
        this.base = base;
    }
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getArea (){
        return base * height / 2.0;
    }
}
