
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class View extends AnchorPane {

    protected final TextField textField;
    protected final Button button;
    protected final Label label;
   
    public View() {
        
        textField = new TextField();
        button = new Button();
        label = new Label();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        textField.setLayoutX(207.0);
        textField.setLayoutY(179.0);

        button.setLayoutX(251.0);
        button.setLayoutY(250.0);
        button.setMnemonicParsing(false);
        button.setText("MOTIVATE");

        label.setLayoutX(280.0);
        label.setLayoutY(118.0);

        getChildren().add(textField);
        getChildren().add(button);
        getChildren().add(label);

        
    }
    public void changeLabel(String text){
        label.setText(text);
    }
    
    public String getTheName(){
        return textField.getText();
    }
}
