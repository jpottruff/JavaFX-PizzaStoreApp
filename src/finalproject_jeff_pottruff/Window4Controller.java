/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_jeff_pottruff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Jeff
 */
public class Window4Controller implements Initializable {
    
    /* FX IDs */
    @FXML 
    private ListView currentCart;
    @FXML
    private TextArea comments;
    
    /* METHODS */
    
    //shows different windows
    @FXML
    private void show1() {
        FinalProject_Jeff_Pottruff.show1();
    }
    @FXML
    private void show2() {
        FinalProject_Jeff_Pottruff.show2();
    }
    @FXML
    private void show3() {
        FinalProject_Jeff_Pottruff.show3();
    }
    
    //FIXME
    //confirms order - note: add this method to the final method - wont need @FXML in the end, just call it
    @FXML
    private void show5(){
        FinalProject_Jeff_Pottruff.show5();
        writeReceipt();
    }
    
    private void writeReceipt() {
        //generate random number between 1 and 999
        Random rand = new Random();
        int orderNum = rand.nextInt(999) + 1;
        
        
        
        //identifying the file
        File receipt = new File("order"+ orderNum + ".txt");
        
        try {
            //checking if the file already exists
            if (!receipt.exists()) {
                //creating file if it doesn't exist
                receipt.createNewFile();
            }
            
            //opening file to write
            //note: not appending - want to overwrite old receipt with new one - if it exists
            FileWriter fw = new FileWriter(receipt.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw); //can not write Strings directly into a file
            
            //format receipt here 
            
            bw.write("******************************");
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.write("      The All Seeing Pie      ");
            bw.newLine();
            bw.write("           Pizzeria           ");
            bw.newLine();
            bw.newLine();
            bw.write("      676 Queen St. West      ");
            bw.newLine();
            bw.write("      Toronto, ON M6J 1E5     ");
            bw.newLine();
            bw.newLine();   
            bw.newLine();
            bw.write("          Order: " + orderNum);
            bw.newLine();
            bw.write("******************************");
            bw.newLine();
            bw.write("           -ORDER-            ");
            bw.newLine();
            
            double price = 0;
            double subtotal = 0;
            
            //accessing array list to create order printout
            //get pizzas

            for (int i = 0; i < Cart.pizzas.size(); i++) {
                String [] pizzaParts = ((Cart.pizzas.get(i)).toString()).split(":");

                price = Double.parseDouble(pizzaParts[2]);
                subtotal += price;


                bw.write(String.format("Size: %-15s $%5.2f", pizzaParts[0], price));
                bw.newLine();
                bw.write("  **" + pizzaParts[1] + " crust");
                bw.newLine();
                //for loop to print toppings
                for (int j = 3; j < pizzaParts.length; j++){
                    bw.write("   >" + pizzaParts[j]);
                    bw.newLine();
                 }

                bw.newLine();
            }
            
            
            //get sides
            
            //garlic bread
            if (Cart.garlicBread.size() > 0){
                int garlicQty = Cart.garlicBread.size();
                //FIXME - alter when chaning side class (TODO)
                price = 3.50;
                double gbTotal = price * garlicQty;
                subtotal += gbTotal;
                bw.write(String.format("%-21s $%-5.2f", "Garlic Bread", gbTotal));
                bw.newLine();
                bw.write("  Qty:" + garlicQty);
                bw.newLine();
                bw.newLine();
            }
            if (Cart.crazySticks.size() > 0){
                int crazyQty = Cart.crazySticks.size();
                //FIXME - alter when chaning side class (TODO)
                price = 3.00;
                double csTotal = price * crazyQty;
                subtotal += csTotal;
                bw.write(String.format("%-21s $%-5.2f", "Crazy Sticks", csTotal));
                bw.newLine();
                bw.write("  Qty:" + crazyQty);
                bw.newLine();
                bw.newLine();
            }
            if (Cart.potatoWedges.size() > 0){
                int potatoQty = Cart.potatoWedges.size();
                //FIXME - alter when chaning side class (TODO)
                price = 4.00;
                double pwTotal = price * potatoQty;
                subtotal += pwTotal;
                bw.write(String.format("%-21s $%-5.2f", "Potato Wedges", pwTotal));
                bw.newLine();
                bw.write("  Qty:" + potatoQty);
                bw.newLine();
                bw.newLine();
            }
            //FIXME
            //change when classes have been remade (TODO)
            if (Cart.dr1.size() > 0 || Cart.dr2.size() > 0 || Cart.dr3.size() > 0
                    ||Cart.dr4.size() > 0 || Cart.dr5.size() > 0){
                bw.write("Drinks  (+$1.00/ea)");
                bw.newLine();
                price = 1.00;
                
                if (Cart.dr1.size() > 0){
                    int dr1Qty = Cart.dr1.size();
                    double dr1Total = price * dr1Qty;
                    subtotal += dr1Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Barq's", dr1Total));
                bw.newLine();
                }
                if (Cart.dr2.size() > 0){
                    int dr2Qty = Cart.dr2.size();
                    double dr2Total = price * dr2Qty;
                    subtotal += dr2Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Coke", dr2Total));
                bw.newLine();
                }
                if (Cart.dr3.size() > 0){
                    int dr3Qty = Cart.dr3.size();
                    double dr3Total = price * dr3Qty;
                    subtotal += dr3Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Ginger Ale", dr3Total));
                bw.newLine();
                }
                if (Cart.dr4.size() > 0){
                    int dr4Qty = Cart.dr4.size();
                    double dr4Total = price * dr4Qty;
                    subtotal += dr4Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Fanta", dr4Total));
                bw.newLine();
                }   
                if (Cart.dr5.size() > 0){
                    int dr5Qty = Cart.dr5.size();
                    double dr5Total = price * dr5Qty;
                    subtotal += dr5Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Iced Tea", dr5Total));
                bw.newLine();
                }   
            }
            
               if (Cart.dip1.size() > 0 || Cart.dip2.size() > 0 || Cart.dip3.size() > 0
                    ||Cart.dip4.size() > 0 || Cart.dip5.size() > 0){
                bw.write("Dips  (+$0.75/ea)");
                bw.newLine();
                price = 0.75;
                
                if (Cart.dip1.size() > 0){
                    int dip1Qty = Cart.dip1.size();
                    double dip1Total = price * dip1Qty;
                    subtotal += dip1Total;
                bw.write(String.format("%-21s $%-5.2f", "  >BBQ", dip1Total));
                bw.newLine();
                }
                if (Cart.dip2.size() > 0){
                    int dip2Qty = Cart.dip2.size();
                    double dip2Total = price * dip2Qty;
                    subtotal += dip2Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Garlic", dip2Total));
                bw.newLine();
                }
                if (Cart.dip3.size() > 0){
                    int dip3Qty = Cart.dip3.size();
                    double dip3Total = price * dip3Qty;
                    subtotal += dip3Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Marinara", dip3Total));
                bw.newLine();
                }
                if (Cart.dip4.size() > 0){
                    int dip4Qty = Cart.dip4.size();
                    double dip4Total = price * dip4Qty;
                    subtotal += dip4Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Ranch", dip4Total));
                bw.newLine();
                }   
                if (Cart.dip5.size() > 0){
                    int dip5Qty = Cart.dip5.size();
                    double dip5Total = price * dip5Qty;
                    subtotal += dip5Total;
                bw.write(String.format("%-21s $%-5.2f", "  >Spicy Cheddar", dip5Total));
                bw.newLine();
                }   
            }


            
            bw.write("******************************");
            bw.newLine();
            
            double tax = subtotal * 0.13;
       
            bw.newLine();
            bw.write(String.format("%-21s $%-5.2f", "Subtotal:", subtotal));
            bw.newLine();
            bw.write(String.format("%-21s $%-5.2f", "Taxes (13%):", tax));
            bw.newLine();
            bw.write(String.format("%-21s $%-5.2f", "Total:", (subtotal + tax)));
            bw.newLine();
            bw.write("******************************");
            bw.newLine();
            bw.newLine();
            //getting specialComments
            bw.write("Comments:");
            
            String instructions = comments.getText();
            bw.newLine();
            bw.write(instructions);
            bw.newLine();
            bw.write("******************************");
            
            
            
            //save file and close
            bw.close();
            fw.close();
            
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    //updates currentCart
    //FIXME - formatting, efficiency
    @FXML
    private void addList() {
        
        //clears old stuff
        currentCart.getItems().clear();
        
        
        //get pizza info
        for (int i = 0; i < Cart.pizzas.size(); i++) {
              
            String [] pizzaParts = ((Cart.pizzas.get(i)).toString()).split(":");
                
                String size = pizzaParts[0];
                Double price = Double.parseDouble(pizzaParts[2]);
                String crust = pizzaParts[1];
                //FIXME - formatting
                String item = String.format("1   %-50s $%5.2f\n  **%s\n", size, price, crust);
                String s = "";
                for (int j = 3; j < pizzaParts.length; j++){
                    s += String.format("   >%s\n", pizzaParts[j]);
                }
                String thing = item + s;
                currentCart.getItems().add(thing);
        }
        
        /* SIDES */
        //garlic bread
        int garlicQty = Cart.garlicBread.size();
        double garlicPrice = garlicQty * 3.50;
        String gb = String.format("%d   Garlic Bread  $%.2f", garlicQty, garlicPrice);
        //crazy sticks
        int crazyQty = Cart.crazySticks.size();
        double crazyPrice = crazyQty * 3.00;
        String cs = String.format("%d   Crazy Sticks  $%.2f", crazyQty, crazyPrice);
        //potato wedges
        int potatoQty = Cart.potatoWedges.size();
        double potatoPrice = potatoQty * 4.00;
        String pw = String.format("%d   Potato Wedges  $%.2f", potatoQty, potatoPrice);
        
        /* Drinks */
        //FIXME - Format properly
        double drinkPrice = 1.00;
        int dr1Qty = Cart.dr1.size();
        double dr1Price = drinkPrice * dr1Qty;
        String dr1 = String.format("%d   Barq's          $%.2f", dr1Qty, dr1Price);
        int dr2Qty = Cart.dr2.size();
        double dr2Price = drinkPrice * dr2Qty;
        String dr2 = String.format("%d   Coke            $%.2f", dr2Qty, dr2Price);
        int dr3Qty = Cart.dr3.size();
        double dr3Price = drinkPrice * dr3Qty;
        String dr3 = String.format("%d   Ginger Ale      $%.2f", dr3Qty, dr3Price);
        int dr4Qty = Cart.dr4.size();
        double dr4Price = drinkPrice * dr4Qty;
        String dr4 = String.format("%d   Fanta           $%.2f", dr4Qty, dr4Price);
        int dr5Qty = Cart.dr5.size();
        double dr5Price = drinkPrice * dr5Qty;
        String dr5 = String.format("%d   Iced Tea        $%.2f", dr5Qty, dr5Price);
        
        /* Dips */
        //FIXME - Format Properly
        double dipPrice = 0.75;
        int dip1Qty = Cart.dip1.size();
        double dip1Price = dipPrice * dip1Qty;
        String dip1 = String.format("%d   BBQ            $%.2f", dip1Qty, dip1Price);
        int dip2Qty = Cart.dip2.size();
        double dip2Price = dipPrice * dip1Qty;
        String dip2 = String.format("%d   Garlic         $%.2f", dip2Qty, dip2Price);
        int dip3Qty = Cart.dip3.size();
        double dip3Price = dipPrice * dip1Qty;
        String dip3 = String.format("%d   Marinara       $%.2f", dip3Qty, dip3Price);
        int dip4Qty = Cart.dip4.size();
        double dip4Price = dipPrice * dip1Qty;
        String dip4 = String.format("%d   Ranch          $%.2f", dip4Qty, dip4Price);
        int dip5Qty = Cart.dip5.size();
        double dip5Price = dipPrice * dip1Qty;
        String dip5 = String.format("%d   Spicy Cheddar  $%.2f", dip5Qty, dip5Price);
        

        
        //ensures only items that exist are printed
        //FIXME - make more efficient
        
       
        //sides
        if (garlicQty > 0){
            currentCart.getItems().add(gb);
        }
        if (crazyQty > 0) {
            currentCart.getItems().add(cs);
        }
        if (potatoQty > 0){
            currentCart.getItems().add(pw);
        }
        //drinks
        if (dr1Qty > 0){
            currentCart.getItems().add(dr1);
        }
        if (dr2Qty > 0){
            currentCart.getItems().add(dr2);
        }
        
        if (dr3Qty > 0){
            currentCart.getItems().add(dr3);
        }
        
        if (dr4Qty > 0){
            currentCart.getItems().add(dr4);
        }
        
        if (dr5Qty > 0){
            currentCart.getItems().add(dr5);
        }
        //dips
        if (dip1Qty > 0){
            currentCart.getItems().add(dip1);
        }
        if (dip2Qty > 0){
            currentCart.getItems().add(dip2);
        }
        if (dip3Qty > 0){
            currentCart.getItems().add(dip3);
        }
        if (dip4Qty > 0){
            currentCart.getItems().add(dip4);
        }
        if (dip5Qty > 0){
            currentCart.getItems().add(dip5);
        }
   
    }
    
    //FIXME - can remove pizzas but need to isolate if dealing with garlic bread, etc -
    //TODO maybe use a vbox with multiple listviews
    @FXML
    private void removeItem() {
        int selected = currentCart.getSelectionModel().getSelectedIndex();
        System.out.println(selected);
        
        
        if (selected < Cart.pizzas.size()) {
            currentCart.getItems().remove(selected);
            Cart.pizzas.remove(selected);
        }
        /*
        //FIXME
        if (selected == Cart.pizzas.size() && Cart.garlicBread.size() > 0) {
            //remove 1 garlic bread
        }
        */
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }    
    
}
