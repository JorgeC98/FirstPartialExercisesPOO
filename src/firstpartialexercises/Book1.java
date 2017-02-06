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
public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    //CONSTRUCTOR
    public Book1(String name, Author author, double price){
        this.name= name;
        this.author = author;
        this.price = price;
    }
    
    public Book1 (String name, Author author, double price, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }
    
    //GET & SET
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    @Override  
     public String toString(){
         return "Book[name="+ this.name + "," + this.author.toString() +", price =" +this.price + ", qty="+this.qty;
     }
}
