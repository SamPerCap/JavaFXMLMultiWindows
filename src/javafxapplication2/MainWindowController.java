/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Samuel
 */
public class MainWindowController implements Initializable {
    
    private Label label;
    @FXML
    private Button questionareButton;
    @FXML
    private TextField nameField;
    @FXML
    private ListView<String> list;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openQuestionareWindow(ActionEvent event) throws IOException {
        
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.WINDOW_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("QuestionareWindow.fxml"));
        
        Parent root = fxmlLoader.load();
        ((QuestionareWindowController)fxmlLoader.getController()).setName(this,nameField.getText());
         
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.showAndWait();
        
       
        
        //((QuestionareWindowController)fxmlLoader.getController()).setNameAndParent(this, nameField.getText());
       
    }
    
    public void addThings(String participantName , int score){
    
    list.getItems().add(participantName+" : "+score);
    
    }
}
