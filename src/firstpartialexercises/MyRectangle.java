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
public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;
    
    //CONSTRUCTOR
    public MyRectangle (int x1, int y1, int x2, int y2){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);   
    }
    
    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
     @Override
    public String toString() {
      return "MyRectangle[v1=" + this.v1 + ",v2=" + this.v2 +"]"; 
    }
    
    //GET & SET
    //SACAR EL AREA
    public double getArea() {
        return ((Math.abs(v1.getX()-v2.getX()))*(Math.abs(v1.getY()-v2.getY())));
    }
   
    //SACAR PERIMETRO
    public double getPerimeter() {
        return (Math.abs(v1.getX()-v2.getX())+Math.abs(v1.getY()-v2.getY()))*2;
    }
}
