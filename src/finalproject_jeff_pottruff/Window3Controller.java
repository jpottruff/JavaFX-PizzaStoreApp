/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_jeff_pottruff;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author Jeff
 */
public class Window3Controller implements Initializable {
    
    
    /*** FX IDs ***/
    
    //Quantity selected labels
    @FXML 
    private Label side1added;
    @FXML 
    private Label side2added;
    @FXML 
    private Label side3added;
    
    @FXML
    private Label dr1added; 
    @FXML
    private Label dr2added; 
    @FXML
    private Label dr3added;
    @FXML
    private Label dr4added;
    @FXML
    private Label dr5added;
    
    @FXML
    private Label dip1added;
    @FXML
    private Label dip2added;
    @FXML
    private Label dip3added;
    @FXML
    private Label dip4added;
    @FXML
    private Label dip5added;
    
    
    //Remove item buttons
    @FXML
    private Button rmgb;
    @FXML
    private Button rmcs;
    @FXML
    private Button rmpw;
    
    
    @FXML
    private Button rmdr1;
    @FXML
    private Button rmdr2;  
    @FXML
    private Button rmdr3;       
    @FXML
    private Button rmdr4;          
    @FXML
    private Button rmdr5;
    
    @FXML
    private Button rmdp1;
    @FXML
    private Button rmdp2;
    @FXML
    private Button rmdp3;
    @FXML
    private Button rmdp4;
    @FXML
    private Button rmdp5;


    
    /*** GLOBAL VARIABLES ***/
    //remove these ass adding to the cart - use get size instead
    int sideClicked;
    int drinkClicked;
    int dipClicked;
    
    /*** METHODS ***/
    
    
    //Showing Windows
   
    @FXML
    private void show1(){
        FinalProject_Jeff_Pottruff.show1();
    }
    //shows pizza window
    @FXML
    private void show2(){
        FinalProject_Jeff_Pottruff.show2();
    }
    //shows cart/checkout
    @FXML
    private void show4() {
        FinalProject_Jeff_Pottruff.show4();
    }
    
    
    //Adding/Removing Sides
    
    @FXML
    private void addGarlicBread(){
        //identifies what button clicked
        sideClicked = 1;
        //adds side accrdingly
        addSide();
    }
    @FXML
    private void addCrazySticks(){
        sideClicked = 2;
        addSide();
    }
    @FXML
    private void addPotatoWedges(){
        sideClicked = 3;
        addSide();
    }  
    
    private void addSide(){
        switch (sideClicked) {
            case 1: Side side1 = new Side("garlic bread", 3.50);
                    Cart.garlicBread.add(side1);
                    side1added.setText(" " + (Cart.garlicBread.size()) + " ");
                    rmgb.setDisable(false);
                    break;
            case 2: Side side2 = new Side("crazy sticks", 3.00);
                    Cart.crazySticks.add(side2);
                    side2added.setText(" " + (Cart.crazySticks.size()) + " ");
                    rmcs.setDisable(false);
                    break;
            case 3: Side side3 = new Side("potato wedges", 4.00);
                    Cart.potatoWedges.add(side3);
                    side3added.setText(" " + (Cart.potatoWedges.size()) + " ");
                    rmpw.setDisable(false);
                    break;  
        } 
    }

    @FXML
    private void removeGarlicBread() {
        sideClicked = -1;
        removeSide();
    }
    @FXML
    private void removeCrazySticks() {
        sideClicked = -2;
        removeSide();
    }  
    @FXML
    private void removePotatoWedges() {
        sideClicked = -3;
        removeSide();
    }
    
    private void removeSide(){
        switch (sideClicked) {
            case -1: 
                if (!Cart.garlicBread.isEmpty()){
                    //remove item
                    Cart.garlicBread.remove(Cart.garlicBread.size() -1);
                    //update quantity on screen
                    if (Cart.garlicBread.isEmpty()){
                        side1added.setText(" - ");
                        rmgb.setDisable(true);
                    } else {
                        side1added.setText(" " + Cart.garlicBread.size() + " ");
                    }
                }
                break;
            case -2:
                if (!Cart.crazySticks.isEmpty()){
                    //remove item
                    Cart.crazySticks.remove(Cart.crazySticks.size() -1);
                    //update quantity on screen
                    if (Cart.crazySticks.isEmpty()){
                        side2added.setText(" - ");
                        rmcs.setDisable(true);
                    } else {
                        side2added.setText(" " + Cart.crazySticks.size() + " ");
                    }
                }
                break;
            case -3:
                if (!Cart.potatoWedges.isEmpty()){
                    //remove item
                    Cart.potatoWedges.remove(Cart.potatoWedges.size() -1);
                    //update quantity on screen
                    if (Cart.potatoWedges.isEmpty()){
                        side3added.setText(" - ");
                        rmpw.setDisable(true);
                    } else {
                        side3added.setText(" " + Cart.potatoWedges.size() + " ");
                    }
                }
                break;
        }
    }
    
    //Adding/Removing Drinks
    
    @FXML
    private void addDrink1(){
        drinkClicked = 1;
        addDrink();
    }
    @FXML
    private void addDrink2(){
        drinkClicked = 2;
        addDrink();
    }
    @FXML
    private void addDrink3(){
        drinkClicked = 3;
        addDrink();
    }
    @FXML
    private void addDrink4(){
        drinkClicked = 4;
        addDrink();
    }
    @FXML
    private void addDrink5(){
        drinkClicked = 5;
        addDrink();
    }
    
    @FXML
    private void addDrink(){
        switch (drinkClicked) {
            case 1: Drink drink1 = new Drink("barq's", 1.00);
                    Cart.dr1.add(drink1);
                    dr1added.setText(" " + (Cart.dr1.size()) + " ");
                    rmdr1.setDisable(false);
                    break;
            case 2: Drink drink2 = new Drink("coke", 1.00);
                    Cart.dr2.add(drink2);
                    dr2added.setText(" " + (Cart.dr2.size()) + " ");
                    rmdr2.setDisable(false);
                    break;
            case 3: Drink drink3 = new Drink("ginger ale", 1.00);
                    Cart.dr3.add(drink3);
                    dr3added.setText(" " + (Cart.dr3.size()) + " ");
                    rmdr3.setDisable(false);
                    break; 
            case 4: Drink drink4 = new Drink("fanta", 1.00);
                    Cart.dr4.add(drink4);
                    dr4added.setText(" " + (Cart.dr4.size()) + " ");
                    rmdr4.setDisable(false);
                    break; 
            case 5: Drink drink5 = new Drink("iced tea", 1.00);
                    Cart.dr5.add(drink5);
                    dr5added.setText(" " + (Cart.dr5.size()) + " ");
                    rmdr5.setDisable(false);
                    break; 
        } 
    }
    
    @FXML
    private void removeDrink1(){
        drinkClicked = -1;
        removeDrink();
    }
    @FXML
    private void removeDrink2(){
        drinkClicked = -2;
        removeDrink();
    }
    @FXML
    private void removeDrink3(){
        drinkClicked = -3;
        removeDrink();
    }
    @FXML
    private void removeDrink4(){
        drinkClicked = -4;
        removeDrink();
    }
    @FXML
    private void removeDrink5(){
        drinkClicked = -5;
        removeDrink();
    }
    
    private void removeDrink(){
        switch (drinkClicked) {
            case -1: 
                if (!Cart.dr1.isEmpty()){
                    //remove item
                    Cart.dr1.remove(Cart.dr1.size() -1);
                    //update quantity on screen
                    if (Cart.dr1.isEmpty()){
                        dr1added.setText(" - ");
                        rmdr1.setDisable(true);
                    } else {
                        dr1added.setText(" " + Cart.dr1.size() + " ");
                    }
                }
                break;
            case -2: 
                if (!Cart.dr2.isEmpty()){
                    //remove item
                    Cart.dr2.remove(Cart.dr2.size() -1);
                    //update quantity on screen
                    if (Cart.dr2.isEmpty()){
                        dr2added.setText(" - ");
                        rmdr2.setDisable(true);
                    } else {
                        dr2added.setText(" " + Cart.dr2.size() + " ");
                    }
                }
                break;
            case -3: 
                if (!Cart.dr3.isEmpty()){
                    //remove item
                    Cart.dr3.remove(Cart.dr3.size() -1);
                    //update quantity on screen
                    if (Cart.dr3.isEmpty()){
                        dr3added.setText(" - ");
                        rmdr3.setDisable(true);
                    } else {
                        dr3added.setText(" " + Cart.dr3.size() + " ");
                    }
                }
                break;
            case -4: 
                if (!Cart.dr4.isEmpty()){
                    //remove item
                    Cart.dr4.remove(Cart.dr4.size() -1);
                    //update quantity on screen
                    if (Cart.dr4.isEmpty()){
                        dr4added.setText(" - ");
                        rmdr4.setDisable(true);
                    } else {
                        dr4added.setText(" " + Cart.dr4.size() + " ");
                    }
                }
                break;
            case -5: 
                if (!Cart.dr5.isEmpty()){
                    //remove item
                    Cart.dr5.remove(Cart.dr5.size() -1);
                    //update quantity on screen
                    if (Cart.dr5.isEmpty()){
                        dr5added.setText(" - ");
                        rmdr5.setDisable(true);
                    } else {
                        dr5added.setText(" " + Cart.dr5.size() + " ");
                    }
                }
                break;
        }
    }
    
    //Adding/Removing Dips
    @FXML 
    private void addDip1(){
        dipClicked = 1;
        addDip();
    }
    @FXML 
    private void addDip2(){
       dipClicked = 2;
       addDip();
    }
    @FXML 
    private void addDip3(){
        dipClicked = 3;
        addDip();
    }
    @FXML 
    private void addDip4(){
        dipClicked = 4;
        addDip();
    }
    @FXML 
    private void addDip5(){
        dipClicked = 5;
        addDip();
    }
    
    @FXML
    private void addDip(){
        switch (dipClicked) {
            case 1: Dip dip1 = new Dip("bbq", 0.75);
                    Cart.dip1.add(dip1);
                    dip1added.setText(" " + (Cart.dip1.size()) + " ");
                    rmdp1.setDisable(false);
                    break;
            case 2: Dip dip2 = new Dip("galic", 0.75);
                    Cart.dip2.add(dip2);
                    dip2added.setText(" " + (Cart.dip2.size()) + " ");
                    rmdp2.setDisable(false);
                    break;
            case 3: Dip dip3 = new Dip("marinara", 0.75);
                    Cart.dip3.add(dip3);
                    dip3added.setText(" " + (Cart.dip3.size()) + " ");
                    rmdp3.setDisable(false);
                    break;
            case 4: Dip dip4 = new Dip("ranch", 0.75);
                    Cart.dip4.add(dip4);
                    dip4added.setText(" " + (Cart.dip4.size()) + " ");
                    rmdp4.setDisable(false);
                    break;
            case 5: Dip dip5 = new Dip("spicy cheddar", 0.75);
                    Cart.dip5.add(dip5);
                    dip5added.setText(" " + (Cart.dip5.size()) + " ");
                    rmdp5.setDisable(false);
        } 
    }
    
    @FXML
    private void removeDip1(){
        dipClicked = -1;
        removeDip();
    }
    @FXML
    private void removeDip2(){
        dipClicked = -2;
        removeDip();
    }
    @FXML
    private void removeDip3(){
        dipClicked = -3;
        removeDip();
    }
    @FXML
    private void removeDip4(){
        dipClicked = -4;
        removeDip();
    }
    @FXML
    private void removeDip5(){
        dipClicked = -5;
        removeDip();
    }
    
    private void removeDip(){
        switch (dipClicked) {
            case -1: 
                if (!Cart.dip1.isEmpty()){
                    //remove item
                    Cart.dip1.remove(Cart.dip1.size() -1);
                    //update quantity on screen
                    if (Cart.dip1.isEmpty()){
                        dip1added.setText(" - ");
                        rmdp1.setDisable(true);
                    } else {
                        dip1added.setText(" " + Cart.dip1.size() + " ");
                    }
                }
                break;
            case -2: 
                if (!Cart.dip2.isEmpty()){
                    //remove item
                    Cart.dip2.remove(Cart.dip2.size() -1);
                    //update quantity on screen
                    if (Cart.dip2.isEmpty()){
                        dip2added.setText(" - ");
                        rmdp2.setDisable(true);
                    } else {
                        dip2added.setText(" " + Cart.dip2.size() + " ");
                    }
                }
                break;
            case -3: 
                if (!Cart.dip3.isEmpty()){
                    //remove item
                    Cart.dip3.remove(Cart.dip3.size() -1);
                    //update quantity on screen
                    if (Cart.dip3.isEmpty()){
                        dip3added.setText(" - ");
                        rmdp3.setDisable(true);
                    } else {
                        dip3added.setText(" " + Cart.dip3.size() + " ");
                    }
                }
                break;
            case -4: 
                if (!Cart.dip4.isEmpty()){
                    //remove item
                    Cart.dip4.remove(Cart.dip4.size() -1);
                    //update quantity on screen
                    if (Cart.dip4.isEmpty()){
                        dip4added.setText(" - ");
                        rmdp4.setDisable(true);
                    } else {
                        dip4added.setText(" " + Cart.dip4.size() + " ");
                    }
                }
                break;
            case -5: 
                if (!Cart.dip5.isEmpty()){
                    //remove item
                    Cart.dip5.remove(Cart.dip5.size() -1);
                    //update quantity on screen
                    if (Cart.dip5.isEmpty()){
                        dip5added.setText(" - ");
                        rmdp5.setDisable(true);
                    } else {
                        dip5added.setText(" " + Cart.dip5.size() + " ");
                    }
                }
                break;
        }
    }
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
