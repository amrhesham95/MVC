/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author AmrHesham
 */
public class Controller extends Application {
    
    Model model = null;
    View view    = null;
    
    @Override
    public void start(Stage primaryStage) {
       
        view = new View();
        model = new Model();
        
        Scene scene = new Scene(view, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        view.button.setOnAction((event)->{
            view.changeLabel(model.businessLogic(view.getTheName()));
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public String businessLogic(String name)
    {
        return model.businessLogic(name);
    }
}
