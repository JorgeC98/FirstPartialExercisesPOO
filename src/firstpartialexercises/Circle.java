/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author JorgeRicardo
 */
public class Circle {
    private double radius;
    
    //CONSTRUCTOR
    public Circle() {
        this(1.0);
    }
    
    public Circle(double radius) { 
        this.radius = radius;
    }
    
    //GET & SET
    public double getRadius() {
        return this.radius;  
    }
    
    public void setRadious(double radius){
        this.radius = radius;
    }
    
    //SACAR EL AREA
    public double getArea(){
         return this.radius*this.radius*Math.PI;
    }
    
    //SACAR PERIMETRO
    public double getCircumference(){
         return this.radius*2*Math.PI;
    }
    
    @Override
    public String toString(){
        return"Circle[radius= "+this.radius+" ]";
    }
}
