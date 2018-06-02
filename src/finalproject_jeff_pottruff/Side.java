
package finalproject_jeff_pottruff;


public class Side {
 
    private String type;
    private double price;
    
    public Side(String type, double price) {
        this.type = type;
        this.price = price;
        
    }
    
    @Override
    public String toString(){
        return  type + ":" + price;
    }
    
}
