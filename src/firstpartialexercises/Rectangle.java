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
public class Rectangle {
    private float lenght;
    private float width;
    
    //CONSTRUCTOR
    public Rectangle(){
        lenght = 1.0f;
        width = 1.0f;
    }
    
    public Rectangle(float lenght,float width) {
        this.lenght = lenght;
        this.width = width;
    }
    
    //GET & SET
    public float getLenght(){
        return this.lenght;
    }
    
    public void setLenght(float lenght){
        this.lenght = lenght;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    //SACAR EL AREA
    public double getArea(){
        return this.lenght*this.width;
    }
    
    //SACAR PERIMETRO
    public double getPerimeter(){
        return (this.lenght*2)+(this.width*2);
    }
    
    @Override
    public String toString(){
        return "Rectangle[lenght= "+this.lenght+", width= "+this.width+"]";
    }
}
