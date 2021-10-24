package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

public class RegisterController {

    @FXML
    private TextField Txtname;
    @FXML
    private TextField Txtmail;
    @FXML
    private TextField Txtpassword;
    @FXML
    private Button Btnregister;
    @FXML
    Alert alertError = new Alert(Alert.AlertType.ERROR);
    private String alertMessage ="";


    public void ClickRegister(ActionEvent actionEvent) {

        if(Txtmail.getText().isEmpty() || Txtname.getText().isEmpty() || Txtpassword.getText().isEmpty()){
            if(Txtname.getText().isEmpty()){
                alertMessage += "Naam is niet ingevuld \n";
            }
            if(Txtmail.getText().isEmpty()){
                alertMessage += "Mail is niet ingevuld \n";
            }
            if(Txtpassword.getText().isEmpty()){
                alertMessage += "Wachtwoord is niet ingevuld \n";
            }

            alertError.setContentText(alertMessage);
            alertError.show();


        }
        alertMessage = "";


}
}