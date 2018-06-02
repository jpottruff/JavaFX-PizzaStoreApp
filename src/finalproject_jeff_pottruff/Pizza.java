
package finalproject_jeff_pottruff;



public class Pizza {
    
    //datafields
    //needs to store all information and price
    private String size;
    private String crust;
    private String toppings;
    private double price;


    
    //constructors
    //add default?
    public Pizza(String size, String crust, String toppings, double price) {

        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.price = price;
    }

    @Override
    public String toString() {
        return size + ":" + crust + ":" + price + ":" + toppings;
    }
    
 

}
