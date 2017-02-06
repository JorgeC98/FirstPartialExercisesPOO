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
public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;
    
    //CONSTRUCTOR
    public Book(String name, Author[] author, double price){
        this.name= name;
        this.author = author;
        this.price = price;
    }
    
    public Book (String name, Author[] author, double price, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }
    
    //GET & SET
    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
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
         return "Book[name="+ this.name + ", Authors={" + this.getAuthorNames(author) +"}, price =" +this.price + ", qty="+this.qty;
     }
    
     public String getAuthorNames(Author[] authors){
         String s ="";
         for (int i=0;i<authors.length;i++){
             s +=authors[i].toString()+",";
         }
         return s;
     }
     
     
}

