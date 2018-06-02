/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_jeff_pottruff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Jeff
 */
public class Window5Controller implements Initializable {
    @FXML
    private TextArea receipt;
    
    
    
    @FXML
    private void show1() {
        FinalProject_Jeff_Pottruff.show1();
    }
    
    /* FIXME - reads as one long line */
    /* FIXME - also need to get corresponding order number - order990 = a test file that currently exists*/
    /* TODO - add button/ functionality to make receipt appear */
    /*
    @FXML
    private void displayOrder() {
        
        
        File myFile = new File("order990.txt");
        
        try {
            if (!myFile.exists()) {
            //note: child class of IOException - do not have to catch if catching an IOException
            throw new FileNotFoundException();
        } 
        
        //open file to read
        FileReader fr = new FileReader(myFile.getAbsoluteFile());
        BufferedReader br = new BufferedReader(fr);
        
        //read from file
        String s;
        while ( (s = br.readLine()) != null) {     //br.readLine()reads as one long line, results in NULL at end of file (*)   
            //append to textarea
            System.out.println(s);  
            receipt.appendText(s);
        }   
        
 
        //close file
        br.close();
        fr.close();  
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        
    }
   */
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
