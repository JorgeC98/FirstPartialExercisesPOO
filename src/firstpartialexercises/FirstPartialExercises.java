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
public class FirstPartialExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //main para checar MyRectangle
    MyRectangle rectangle = new MyRectangle(4,5,8,9);  //topLeft(1,7) bottomRight(4,2)
    System.out.println(rectangle);  //Prints the String
    System.out.println("Area is " + rectangle.getArea());  //Print area of the rectangle
    System.out.println("Perimeter is " + rectangle.getPerimeter());  //Print perimeter of the rectangle
    }
}
    
    

