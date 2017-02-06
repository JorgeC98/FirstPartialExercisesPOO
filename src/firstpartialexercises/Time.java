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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    //CONSTRUCTOR
    public Time(int hour, int minute, int second){
        this.hour = hour; 
        this.minute = minute;
        this.second = second; 
    }
    
    //GET & SET
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return String.format("%02d", this.hour)+":"+String.format("%02d", this.minute)+":"+this.second;
     }
    
    //UN SEGUNDO ANTES
    public Time nextSecond(){
        this.second++;
        if (this.second==60){
            this.second=0;
            this.minute++;
        }
        
        if (this.minute==60){
            this.minute=0;
            this.hour++;
        }
        
       if (this.hour==60){
            this.hour=0;
        }
       return this;
    }
    
    //UN SEGUNDO DESPUES
    public Time previousSecond(){
    this.second--;
        if (this.second==0){
            this.second=59;
            this.minute--;
        }
        
        if (this.minute==0){
            this.minute=59;
            this.hour++;
        }
        
       if (this.hour==0){
            this.hour=23;
        }
       return this;
    }
}
