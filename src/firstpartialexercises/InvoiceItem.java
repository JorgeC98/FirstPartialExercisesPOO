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
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    //CONSTRUCTOR
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    //GET & SET
    public String getID(){
        return this.id;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public double getUnitPrice(){
        return this.unitPrice;
    }
    
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public int getTotal(){
        return (this.unitPrice*this.qty);
    }
    
    @Override
    public String toString(){
    return "Invoice Item[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";      
    }   
    
    


}

