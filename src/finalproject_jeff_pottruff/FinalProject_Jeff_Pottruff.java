/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_jeff_pottruff;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jeff
 */
public class FinalProject_Jeff_Pottruff extends Application {
    
    //static stages go here (see MultiWindow Example) - must be global
    static Stage stage1 = new Stage();
    static Stage stage2 = new Stage();
    static Stage stage3 = new Stage();
    static Stage stage4 = new Stage();
    static Stage stage5 = new Stage();
    
    //global controller vairables go here - should be static?
    static Window1Controller c1;
    static Window2Controller c2;
    static Window3Controller c3;
    static Window4Controller c4;
    static Window5Controller c5;
    
    
    @Override
    public void start(Stage stage) throws Exception {

        
        //FXMLLoader # go here
        FXMLLoader r1 = new FXMLLoader(getClass().getResource("Window1.fxml"));
        FXMLLoader r2 = new FXMLLoader(getClass().getResource("Window2.fxml"));
        FXMLLoader r3 = new FXMLLoader(getClass().getResource("Window3.fxml"));
        FXMLLoader r4 = new FXMLLoader(getClass().getResource("Window4.fxml"));
        FXMLLoader r5 = new FXMLLoader(getClass().getResource("Window5.fxml"));
        
        //Parent root# go here
        Parent root1 = r1.load();
        Parent root2 = r2.load();
        Parent root3 = r3.load();
        Parent root4 = r4.load();
        Parent root5 = r5.load();
        
        //static links to controller here
        
        //Scenes here
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        Scene scene5 = new Scene(root5);
        
        //setScenes here
        stage1.setScene(scene1);
        stage2.setScene(scene2);
        stage3.setScene(scene3);
        stage4.setScene(scene4);
        stage5.setScene(scene5);
        
        //show first window here
        stage1.show();

    }
    
    //methods go here
    public static void show1() {
        stage1.show();
        stage2.hide();
        stage3.hide();
        stage4.hide();
        stage5.hide();
        
    }
    
    public static void show2() {
        stage2.show();
        stage1.hide();
        stage3.hide();
        stage4.hide();
        stage5.hide();
    }
    
    public static void show3() {
        stage3.show();
        stage1.hide();
        stage2.hide();
        stage4.hide();
        stage5.hide();
    }
    
    public static void show4() {
        stage4.show();
        stage1.hide();
        stage2.hide();
        stage3.hide();
        stage5.hide();  
    }
    
    public static void show5() {
        stage5.show();
        stage1.hide();
        stage2.hide();
        stage3.hide();
        stage4.hide();
    }
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
