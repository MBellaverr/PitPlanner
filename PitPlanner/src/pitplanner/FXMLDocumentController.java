/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitplanner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 05200253
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nick_field;
    @FXML
    private TextField password_field;
    @FXML
    private Button login_button;
    
    @FXML
    private void loginButtonAction(ActionEvent event) {
        label.setText(nick_field.getText() + password_field.getText());
        
        if (password_field.getText() != "enter") {
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("ERRO");
            dialogoErro.setHeaderText("Login ou senha inexistentes!");
            dialogoErro.showAndWait();
        } else {
        
            Alert dialogoErro = new Alert(Alert.AlertType.WARNING);
            dialogoErro.setTitle("VOCE ENTROU");
            dialogoErro.showAndWait();
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
