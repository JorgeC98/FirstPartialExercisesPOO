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
public class Author {
    private String name;
    private String email;
    private char gender;
    
    //CONSTRUCTOR
     public Author(String name, String email, char gender){
        this.name = name; 
        this.email = email;
        this.gender = gender; 
    }
     
     //GET & SET
     public String getName(){
        return this.name;
     }
     
     public String getEmail(){
        return this.email;
     }
     
     public void setEmail(String email){
        this.email = email;
     }
     
     public char getGender(){
        return this.gender;
     }
     
     @Override
     public String toString(){
        return "Author[name="+this.name + ",email=" +this.email + ", gender="+this.gender+ "]"; 
     }
}

