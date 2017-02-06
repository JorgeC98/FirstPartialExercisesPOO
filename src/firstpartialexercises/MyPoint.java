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
public class MyPoint {
    private int x;
    private int y;
    
    //CONSTRUCTOR
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //GET & SET
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY() {
      int[] results = new int[2];
      results[0] = this.x;
      results[1] = this.y;
      return results;
    }

    public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance(int x, int y){
        int x2 = this.x - x;
        int y2 = this.y - y;
        return Math.sqrt((x2*x2) + (y2*y2));
    }
    
    public double distance(MyPoint another){
        int x2 = this.x - another.x;
        int y2 = this.y - another.y;
        return Math.sqrt((x2*x2)+(y2*y2));
    }
    
    public double distance(){
        int x2 = this.x - 0;
        int y2 = this.y - 0;
        return Math.sqrt((x2*x2)+(y2*y2));
    }
}
    
    

