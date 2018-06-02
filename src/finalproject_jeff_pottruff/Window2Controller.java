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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Jeff
 */
public class Window2Controller implements Initializable {
    
    //FX IDs
    @FXML
    private RadioButton small; 
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private RadioButton xl;
    
    @FXML
    private RadioButton regular;
    @FXML
    private RadioButton thin;
    @FXML
    private RadioButton stuffed;
    
    @FXML
    private CheckBox bacon;
    @FXML
    private CheckBox ham;
    @FXML
    private CheckBox pepperoni; 
    @FXML
    private CheckBox anchovies;  
    @FXML
    private CheckBox broccoli;    
    @FXML
    private CheckBox mushrooms;        
    @FXML
    private CheckBox olives;            
    @FXML
    private CheckBox onions;                
    @FXML
    private CheckBox peppers;                    
    @FXML
    private CheckBox tomatoes;
    
    @FXML
    private CheckBox prosciutto;
    @FXML
    private CheckBox sausage;    
    @FXML
    private CheckBox artichokes;
    @FXML
    private CheckBox kale; 
    @FXML
    private CheckBox rapini;           
    @FXML
    private CheckBox sundried;
    
    @FXML
    private CheckBox basil; 
    @FXML
    private CheckBox chili;
    @FXML
    private CheckBox garlic;
    @FXML
    private CheckBox oregano;
    
    
    @FXML
    private RadioButton baconLS;
    @FXML
    private RadioButton baconRS;
    @FXML
    private RadioButton baconAll;
    @FXML
    private RadioButton hamLS;
    @FXML
    private RadioButton hamRS;
    @FXML
    private RadioButton hamAll;
    @FXML
    private RadioButton pepperoniLS;
    @FXML
    private RadioButton pepperoniRS;
    @FXML
    private RadioButton pepperoniAll;
    @FXML
    private RadioButton anchovyLS;
    @FXML
    private RadioButton anchovyRS;
    @FXML
    private RadioButton anchovyAll;
    @FXML
    private RadioButton broccoliLS;
    @FXML
    private RadioButton broccoliRS;
    @FXML
    private RadioButton broccoliAll;
    @FXML
    private RadioButton mushroomsLS;
    @FXML
    private RadioButton mushroomsRS;
    @FXML
    private RadioButton mushroomsAll;
    @FXML
    private RadioButton olivesLS;
    @FXML
    private RadioButton olivesRS;
    @FXML
    private RadioButton olivesAll;
    @FXML
    private RadioButton onionsLS;
    @FXML
    private RadioButton onionsRS;
    @FXML
    private RadioButton onionsAll;
    @FXML
    private RadioButton peppersLS;
    @FXML
    private RadioButton peppersRS;
    @FXML
    private RadioButton peppersAll;
    @FXML
    private RadioButton tomatoesLS;
    @FXML
    private RadioButton tomatoesRS;
    @FXML
    private RadioButton tomatoesAll;
    
    @FXML
    private RadioButton prosciuttoLS;
    @FXML
    private RadioButton prosciuttoRS;
    @FXML
    private RadioButton prosciuttoAll;
    @FXML
    private RadioButton sausageLS;
    @FXML
    private RadioButton sausageRS;
    @FXML
    private RadioButton sausageAll;
    @FXML
    private RadioButton artichokesLS;
    @FXML
    private RadioButton artichokesRS;
    @FXML
    private RadioButton artichokesAll;
    @FXML
    private RadioButton kaleLS;
    @FXML
    private RadioButton kaleRS;
    @FXML
    private RadioButton kaleAll;
    @FXML
    private RadioButton rapiniLS;
    @FXML
    private RadioButton rapiniRS;
    @FXML
    private RadioButton rapiniAll;
    @FXML   
    private RadioButton sundriedLS;
    @FXML
    private RadioButton sundriedRS;
    @FXML
    private RadioButton sundriedAll;
    
    @FXML 
    private RadioButton basilLS;
    @FXML 
    private RadioButton basilRS;
    @FXML 
    private RadioButton basilAll;
    @FXML 
    private RadioButton chiliLS;
    @FXML 
    private RadioButton chiliRS;
    @FXML 
    private RadioButton chiliAll;
     @FXML 
    private RadioButton garlicLS;
    @FXML 
    private RadioButton garlicRS;
    @FXML 
    private RadioButton garlicAll;
    @FXML 
    private RadioButton oreganoLS;
    @FXML 
    private RadioButton oreganoRS;
    @FXML 
    private RadioButton oreganoAll;
            
    
    
    
    
    @FXML
    private ImageView baconL;
    @FXML
    private ImageView baconR;
    @FXML
    private ImageView hamL;
    @FXML
    private ImageView hamR;
    @FXML
    private ImageView pepperoniL;
    @FXML
    private ImageView pepperoniR;
    @FXML
    private ImageView anchovyL;
    @FXML
    private ImageView anchovyR;
    @FXML
    private ImageView broccoliL;
    @FXML
    private ImageView broccoliR;
    @FXML
    private ImageView mushroomsL;
    @FXML
    private ImageView mushroomsR;
    @FXML
    private ImageView olivesL;
    @FXML
    private ImageView olivesR;
    @FXML
    private ImageView onionsL;
    @FXML
    private ImageView onionsR;
    @FXML
    private ImageView peppersL;
    @FXML
    private ImageView peppersR;
    @FXML
    private ImageView tomatoesL;
    @FXML
    private ImageView tomatoesR;
    
    @FXML
    private ImageView prosciuttoL;
    @FXML
    private ImageView prosciuttoR;
    @FXML
    private ImageView sausageL;
    @FXML
    private ImageView sausageR;
    @FXML
    private ImageView artichokesL;
    @FXML
    private ImageView artichokesR;
    @FXML
    private ImageView kaleL;
    @FXML
    private ImageView kaleR;
    @FXML
    private ImageView rapiniL;
    @FXML
    private ImageView rapiniR;
    @FXML
    private ImageView sundriedL;
    @FXML
    private ImageView sundriedR;
    
    @FXML 
    private Label circumference; 
    @FXML
    private Label regularToppingsPrice;
    @FXML
    private Label premiumToppingsPrice;
    @FXML
    private Label stuffedPrice;
    
    @FXML
    private Label pizzaTotal;

    //GLOBAL VARIABLES
    String size;
    String crust;
    double currentPizzaTotal;
    
    //METHODS
    
    //goes to sides window
    @FXML
    private void show1() {
        FinalProject_Jeff_Pottruff.show1();
    }
    @FXML
    private void show3() {
        //call resetWindow on window change
        FinalProject_Jeff_Pottruff.show3();
    }
    
    //goes to cart window
    @FXML
    private void show4() {
        //call resetWindow on window change
        FinalProject_Jeff_Pottruff.show4();
    }
    
    @FXML
    private void addPizzaToList() {
        
        
        //get the topping variables that are selected 
        String toppings = getToppings();
        
        //create pizza object and add to list
        
        Pizza p = new Pizza(size, crust, toppings, currentPizzaTotal);
        Cart.pizzas.add(p);
        
        //reset variables in window and globals (see method)
        resetWindow();

    }
/*** methods used by addPizzaToList ***/
    
    //gets the toppings selected when pizza is added
    private String getToppings() {
        String finalToppings = "";
          
        if (bacon.isSelected()){
            finalToppings += "bacon:";
        }
        
        if (ham.isSelected()){
            finalToppings += "ham:";
        }
        
        if (pepperoni.isSelected()){
            finalToppings += "pepperoni:";
        }
        
        if (anchovies.isSelected()){
            finalToppings += "anchovies:";
        }
        
        if (broccoli.isSelected()){
            finalToppings += "broccoli:";
        }
        
        if (mushrooms.isSelected()){
            finalToppings += "mushrooms:";
        }
        
        if (olives.isSelected()){
            finalToppings += "olives:";
        }
        
        if (onions.isSelected()){
            finalToppings += "onions:";
        }
        
        if (peppers.isSelected()){
            finalToppings += "peppers:";
        }
        
        if (tomatoes.isSelected()){
            finalToppings += "tomatoes:";
        }
        
        if (prosciutto.isSelected()){
            finalToppings += "prosciutto:";
        }
        
        if (sausage.isSelected()){
            finalToppings += "sausage:";
        }
        
        if (artichokes.isSelected()){
            finalToppings += "artichokes:";
        }
        
        if (kale.isSelected()) {
            finalToppings += "kale:";
        }
        
        if (rapini.isSelected()){
            finalToppings += "rapini:";
        }
        
        if (sundried.isSelected()){
            finalToppings += "sundried tomatoes:";
        }
        
        if (basil.isSelected()){
            finalToppings += "basil:";
        }
        
        if (chili.isSelected()){
            finalToppings += "chili flakes:";
        }
        
        if (garlic.isSelected()){
            finalToppings += "garlic:";
        }
        
        if (oregano.isSelected()){
            finalToppings += "oregano:";
        }
        
        
        return finalToppings;
    }
    
    @FXML
    private void resetWindow() {
        
        //resetting size buttons
        small.setSelected(true);
        //sets other variables
        addSize();
        medium.setSelected(false);
        large.setSelected(false);
        xl.setSelected(false);
        
        //resetting crust
        regular.setSelected(true);
        thin.setSelected(false);
        stuffed.setSelected(false);
        
        //resetting regular toppings
        bacon.setSelected(false);
        ham.setSelected(false);
        pepperoni.setSelected(false);
        anchovies.setSelected(false);
        broccoli.setSelected(false);
        mushrooms.setSelected(false);
        olives.setSelected(false);
        onions.setSelected(false);
        peppers.setSelected(false);
        tomatoes.setSelected(false);
        //this will reset the images
        addRegularToppings();
        
        //resetting premium toppings
        prosciutto.setSelected(false);
        sausage.setSelected(false);
        artichokes.setSelected(false);
        kale.setSelected(false);
        rapini.setSelected(false);
        sundried.setSelected(false);
        //this will reset the images
        addPremiumToppings();
        
        //resetting free toppings
        basil.setSelected(false);
        basilLS.setSelected(false);
        basilRS.setSelected(false);
        basilAll.setSelected(false);
        chili.setSelected(false);
        chiliLS.setSelected(false);
        chiliRS.setSelected(false);
        chiliAll.setSelected(false);
        garlic.setSelected(false);
        garlicLS.setSelected(false);
        garlicRS.setSelected(false);
        garlicAll.setSelected(false);
        oregano.setSelected(false);
        oreganoLS.setSelected(false);
        oreganoRS.setSelected(false);
        oreganoAll.setSelected(false);
        
        //resetting total price in window
        pizzaTotal.setText("Current Pizza Total:\n$0.00");
        /*
        circumference.setText("| - - - - -    \"  - - - - - |");
        stuffedPrice.setText("(select size to view price)");
        regularToppingsPrice.setText("(select size to view price)");
        premiumToppingsPrice.setText("select size to view price)");
        */
        circumference.setText("| - - - - -  12\"  - - - - - |");
        regularToppingsPrice.setText("+ $1.00/ea");
        premiumToppingsPrice.setText("+ $2.00/ea");
        stuffedPrice.setText("+ $3.00");
        addSize();
        
        //resetting globals
        size = "small";
        crust = "regular";
        //currentPizzaTotal = ;
        setVariables();
               
    }
    
    //sets the variables on the screen based on user selection
    @FXML
    private void setVariables() {
        
        //variables used to calculate current pizza total reflected on screen
        double numRegular;
        double numPremium;     
        
        //selecting size changes the prices in the window
        size = addSize();
        //storing price of crust
        crust = addCrust();
        //store number of regularToppings selected - will affect price
        numRegular = addRegularToppings();
        //store number of premiumToppings selected - will affect price
        numPremium = addPremiumToppings();
        
        //calculating total based on what is selected, setting total in window to reflect
        currentPizzaTotal = getTotal(size, crust, numRegular, numPremium);
        pizzaTotal.setText(String.format("Current Pizza Total:\n$%.2f", currentPizzaTotal));
        
    }
    
/*** methods called in set variables ***/
    
    private String addSize() {
        
        String sizeSelected = "";
        
        if (small.isSelected()){
            circumference.setText("| - - - - -  12\"  - - - - - |");
            regularToppingsPrice.setText("+ $1.00/ea");
            premiumToppingsPrice.setText("+ $2.00/ea");
            stuffedPrice.setText("+ $3.00");
            sizeSelected = "small";
        } else if (medium.isSelected()) {
            circumference.setText("| - - - - -  14\"  - - - - - |");
            regularToppingsPrice.setText("+ $1.50/ea");
            premiumToppingsPrice.setText("+ $2.75/ea");
            stuffedPrice.setText("+ $4.00");
            sizeSelected = "medium";
        } else if (large.isSelected()) {
            circumference.setText("| - - - - -  16\"  - - - - - |");
            regularToppingsPrice.setText("+ $2.00/ea");
            premiumToppingsPrice.setText("+ $3.50/ea");
            stuffedPrice.setText("+ $5.00");
            sizeSelected = "large";
        } else if (xl.isSelected()) {
            circumference.setText("| - - - - -  18\"  - - - - - |");
            regularToppingsPrice.setText("+ $2.25/ea");
            premiumToppingsPrice.setText("+ $4.00/ea");
            stuffedPrice.setText("+ $6.00");
            sizeSelected = "xl";
        }
        
        return sizeSelected;
    }
    
    private String addCrust() {
        
        String crustSelected = "";
        
        if (regular.isSelected()){
            crustSelected = "regular";
        } else if (thin.isSelected()){
            crustSelected = "thin";
        } else if (stuffed.isSelected()){
            crustSelected = "stuffed";
        }
        
        return crustSelected;
    }

    
    private double addRegularToppings() {
        
        double regularToppings = 0;
        
        
        if (bacon.isSelected()){
            if (baconLS.isSelected()){
                baconL.setVisible(true);
                baconR.setVisible(false);
                regularToppings += 0.5;
            } else if (baconRS.isSelected()) {
                baconL.setVisible(false);
                baconR.setVisible(true);
                regularToppings += 0.5;
            } else {
                baconAll.setSelected(true);
                baconL.setVisible(true);
                baconR.setVisible(true);
                regularToppings += 1;
            }
        }  else {
            //ensures images removed if user unclicks the selection
            baconL.setVisible(false);
            baconR.setVisible(false);
            baconLS.setSelected(false);
            baconRS.setSelected(false);
            baconAll.setSelected(false);
        }
        
        
        if (ham.isSelected()){
            if (hamLS.isSelected()){
                hamL.setVisible(true);
                hamR.setVisible(false);
                regularToppings += 0.5;
            } else if (hamRS.isSelected()) {
                hamL.setVisible(false);
                hamR.setVisible(true);
                regularToppings += 0.5;
            } else {
                hamAll.setSelected(true);
                hamL.setVisible(true);
                hamR.setVisible(true);
                regularToppings += 1;
            }
        }  else {
            hamL.setVisible(false);
            hamR.setVisible(false);
            hamLS.setSelected(false);
            hamRS.setSelected(false);
            hamAll.setSelected(false);
        }
        
        if (pepperoni.isSelected()){
            if (pepperoniLS.isSelected()){
                pepperoniL.setVisible(true);
                pepperoniR.setVisible(false);
                regularToppings += 0.5;
            } else if (pepperoniRS.isSelected()) {
                pepperoniL.setVisible(false);
                pepperoniR.setVisible(true);
                regularToppings += 0.5;
            } else {
                pepperoniAll.setSelected(true);
                pepperoniL.setVisible(true);
                pepperoniR.setVisible(true);
                regularToppings += 1;
            }
        }  else {
            pepperoniL.setVisible(false);
            pepperoniR.setVisible(false);
            pepperoniLS.setSelected(false);
            pepperoniRS.setSelected(false);
            pepperoniAll.setSelected(false);
        }
        
        if (anchovies.isSelected()){
            if (anchovyLS.isSelected()){
                anchovyL.setVisible(true);
                anchovyR.setVisible(false);
                regularToppings += 0.5;
            } else if (anchovyRS.isSelected()) {
                anchovyL.setVisible(false);
                anchovyR.setVisible(true);
                regularToppings += 0.5;
            } else {
                anchovyAll.setSelected(true);
                anchovyL.setVisible(true);
                anchovyR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            anchovyL.setVisible(false);
            anchovyR.setVisible(false);
            anchovyLS.setSelected(false);
            anchovyRS.setSelected(false);
            anchovyAll.setSelected(false);
        }
        
        if (broccoli.isSelected()){
            if (broccoliLS.isSelected()){
                broccoliL.setVisible(true);
                broccoliR.setVisible(false);
                regularToppings += 0.5;
            } else if (broccoliRS.isSelected()) {
                broccoliL.setVisible(false);
                broccoliR.setVisible(true);
                regularToppings += 0.5;
            } else {
                broccoliAll.setSelected(true);
                broccoliL.setVisible(true);
                broccoliR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            broccoliL.setVisible(false);
            broccoliR.setVisible(false);
            broccoliLS.setSelected(false);
            broccoliRS.setSelected(false);
            broccoliAll.setSelected(false);
        }
        
        
        if (mushrooms.isSelected()){
            if (mushroomsLS.isSelected()){
                mushroomsL.setVisible(true);
                mushroomsR.setVisible(false);
                regularToppings += 0.5;
            } else if (mushroomsRS.isSelected()) {
                mushroomsL.setVisible(false);
                mushroomsR.setVisible(true);
                regularToppings += 0.5;
            } else {
                mushroomsAll.setSelected(true);
                mushroomsL.setVisible(true);
                mushroomsR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            mushroomsL.setVisible(false);
            mushroomsR.setVisible(false);
            mushroomsLS.setSelected(false);
            mushroomsRS.setSelected(false);
            mushroomsAll.setSelected(false);
        }
        
        if (olives.isSelected()){
            if (olivesLS.isSelected()){
                olivesL.setVisible(true);
                olivesR.setVisible(false);
                regularToppings += 0.5;
            } else if (olivesRS.isSelected()) {
                olivesL.setVisible(false);
                olivesR.setVisible(true);
                regularToppings += 0.5;
            } else {
                olivesAll.setSelected(true);
                olivesL.setVisible(true);
                olivesR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            olivesL.setVisible(false);
            olivesR.setVisible(false);
            olivesLS.setSelected(false);
            olivesRS.setSelected(false);
            olivesAll.setSelected(false);
        }
        
        
        if (onions.isSelected()){
            if (onionsLS.isSelected()){
                onionsL.setVisible(true);
                onionsR.setVisible(false);
                regularToppings += 0.5;
            } else if (onionsRS.isSelected()) {
                onionsL.setVisible(false);
                onionsR.setVisible(true);
                regularToppings += 0.5;
            } else {
                onionsAll.setSelected(true);
                onionsL.setVisible(true);
                onionsR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            onionsL.setVisible(false);
            onionsR.setVisible(false);
            onionsLS.setSelected(false);
            onionsRS.setSelected(false);
            onionsAll.setSelected(false);
        }
        
        if (peppers.isSelected()){
            if (peppersLS.isSelected()){
                peppersL.setVisible(true);
                peppersR.setVisible(false);
                regularToppings += 0.5;
            } else if (peppersRS.isSelected()) {
                peppersL.setVisible(false);
                peppersR.setVisible(true);
                regularToppings += 0.5;
            } else {
                peppersAll.setSelected(true);
                peppersL.setVisible(true);
                peppersR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            peppersL.setVisible(false);
            peppersR.setVisible(false);
            peppersLS.setSelected(false);
            peppersRS.setSelected(false);
            peppersAll.setSelected(false);
        }
        
        if (tomatoes.isSelected()){
            if (tomatoesLS.isSelected()){
                tomatoesL.setVisible(true);
                tomatoesR.setVisible(false);
                regularToppings += 0.5;
            } else if (tomatoesRS.isSelected()) {
                tomatoesL.setVisible(false);
                tomatoesR.setVisible(true);
                regularToppings += 0.5;
            } else {
                tomatoesAll.setSelected(true);
                tomatoesL.setVisible(true);
                tomatoesR.setVisible(true);
                regularToppings += 1;
            }
        } else {
            tomatoesL.setVisible(false);
            tomatoesR.setVisible(false);
            tomatoesLS.setSelected(false);
            tomatoesRS.setSelected(false);
            tomatoesAll.setSelected(false);
        }

        return regularToppings;
    }      
    
    private double addPremiumToppings() {
        double premiumToppings = 0;
        
        if (prosciutto.isSelected()){
            if (prosciuttoLS.isSelected()){
                prosciuttoL.setVisible(true);
                prosciuttoR.setVisible(false);
                premiumToppings += 0.5;
            } else if (prosciuttoRS.isSelected()) {
                prosciuttoL.setVisible(false);
                prosciuttoR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                prosciuttoAll.setSelected(true);
                prosciuttoL.setVisible(true);
                prosciuttoR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            prosciuttoL.setVisible(false);
            prosciuttoR.setVisible(false);
            prosciuttoLS.setSelected(false);
            prosciuttoRS.setSelected(false);
            prosciuttoAll.setSelected(false);
        }
        
        if (sausage.isSelected()){
            if (sausageLS.isSelected()){
                sausageL.setVisible(true);
                sausageR.setVisible(false);
                premiumToppings += 0.5;
            } else if (sausageRS.isSelected()) {
                sausageL.setVisible(false);
                sausageR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                sausageAll.setSelected(true);
                sausageL.setVisible(true);
                sausageR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            sausageL.setVisible(false);
            sausageR.setVisible(false);
            sausageLS.setSelected(false);
            sausageRS.setSelected(false);
            sausageAll.setSelected(false);
        }
        
        
        if (artichokes.isSelected()){
            if (artichokesLS.isSelected()){
                artichokesL.setVisible(true);
                artichokesR.setVisible(false);
                premiumToppings += 0.5;
            } else if (artichokesRS.isSelected()) {
                artichokesL.setVisible(false);
                artichokesR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                artichokesAll.setSelected(true);
                artichokesL.setVisible(true);
                artichokesR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            artichokesL.setVisible(false);
            artichokesR.setVisible(false);
            artichokesLS.setSelected(false);
            artichokesRS.setSelected(false);
            artichokesAll.setSelected(false);
        }
        
        if (kale.isSelected()) {
            if (kaleLS.isSelected()){
                kaleL.setVisible(true);
                kaleR.setVisible(false);
                premiumToppings += 0.5;
            } else if (kaleRS.isSelected()) {
                kaleL.setVisible(false);
                kaleR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                kaleAll.setSelected(true);
                kaleL.setVisible(true);
                kaleR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            kaleL.setVisible(false);
            kaleR.setVisible(false);
            kaleLS.setSelected(false);
            kaleRS.setSelected(false);
            kaleAll.setSelected(false);
        }
        
        if (rapini.isSelected()){
            if (rapiniLS.isSelected()){
                rapiniL.setVisible(true);
                rapiniR.setVisible(false);
                premiumToppings += 0.5;
            } else if (rapiniRS.isSelected()) {
                rapiniL.setVisible(false);
                rapiniR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                rapiniAll.setSelected(true);
                rapiniL.setVisible(true);
                rapiniR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            rapiniL.setVisible(false);
            rapiniR.setVisible(false);
            rapiniLS.setSelected(false);
            rapiniRS.setSelected(false);
            rapiniAll.setSelected(false);
        }
        
        if (sundried.isSelected()){
            if (sundriedLS.isSelected()){
                sundriedL.setVisible(true);
                sundriedR.setVisible(false);
                premiumToppings += 0.5;
            } else if (sundriedRS.isSelected()) {
                sundriedL.setVisible(false);
                sundriedR.setVisible(true);
                premiumToppings += 0.5;
            } else {
                sundriedAll.setSelected(true);
                sundriedL.setVisible(true);
                sundriedR.setVisible(true);
                premiumToppings += 1;
            }
        } else {
            sundriedL.setVisible(false);
            sundriedR.setVisible(false);
            sundriedLS.setSelected(false);
            sundriedRS.setSelected(false);
            sundriedAll.setSelected(false);
        }
        
        return premiumToppings;
    }
    
    
    private double getTotal(String size, String crustType, double numRegToppings, double numPreToppings){
        
        double sizePrice = 0;
        double regToppingsPrice = 0;
        double preToppingsPrice = 0;
        double stuffedCost = 0;
        
        double crustPrice = 0;
        double toppingsTotal; 
        double numTotal;
        
        switch (size) {
            case "small": sizePrice = 9.50;
                          regToppingsPrice = 1.0;
                          preToppingsPrice = 2.0;
                          stuffedCost = 3.0;
                          break;
            case "medium": sizePrice = 12.50;
                           regToppingsPrice = 1.5;
                           preToppingsPrice = 2.75;
                           stuffedCost = 4.0;
                           break;
                
            case "large": sizePrice = 14.50;
                          regToppingsPrice = 2.0;
                          preToppingsPrice = 3.5;
                          stuffedCost = 5.0;
                          break;
            case "xl": sizePrice = 16.50;
                       regToppingsPrice = 2.25;
                       preToppingsPrice = 4.0;
                       stuffedCost = 6.0;
        }   
        
        if (crustType.equals("stuffed")) {
            crustPrice = stuffedCost;
        }
        
        toppingsTotal = (regToppingsPrice * numRegToppings) + (preToppingsPrice * numPreToppings);
        numTotal = sizePrice + crustPrice + toppingsTotal;
        
        return numTotal;
            
    }
    
/*** end of methods called in set variables ***/
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}
