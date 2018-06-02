/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_jeff_pottruff;

/**
 *
 * @author Jeff
 */
public class Dip {
    
    private String type;
    private double price;
    
    public Dip (String type, double price) {
        this.type = type;
        this.price = price;
    }
    
    @Override 
    public String toString() {
        return  type + ":" + price;
    }
}
