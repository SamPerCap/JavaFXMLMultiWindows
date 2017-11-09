/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Samuel
 */
public class QuestionareWindowController implements Initializable {

    MainWindowController parentWindow;
    String personName ="";
    
    
    @FXML
    private ToggleGroup grp1;
    @FXML
    private ToggleGroup grp2;
    @FXML
    private ToggleGroup grp3;
    @FXML
    private ToggleGroup grp4;
    @FXML
    private ToggleGroup grp5;
    @FXML
    private ToggleGroup grp6;
    @FXML
    private ToggleGroup grp7;
    @FXML
    private Label nameLabel;
    @FXML
    private Button calculateButton;

    private int score = 0;
    @FXML
    private Label totalscore;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setName(MainWindowController mwc, String personName){
    parentWindow = mwc;
    this.personName = personName;
    nameLabel.setText(personName);
    }

    @FXML
    private void saveScore(ActionEvent event) {
     
     this.totalscore = totalscore;
     totalscore.textProperty().setValue("" + score);
    }

    @FXML
    private int radioButton1(ActionEvent event) {
        
        score++;
        return score;
        
    }

    @FXML
    private int radioButton2(ActionEvent event) {
        
        
        return score;
    }

    @FXML
    private int radioButton3(ActionEvent event) {
        
        score--;
        return score;
    }

    @FXML
    public void saveButton(ActionEvent event) {
        
        parentWindow.addThings(personName, score);
        ((Stage)totalscore.getScene().getWindow()).close();
        
    }


}
