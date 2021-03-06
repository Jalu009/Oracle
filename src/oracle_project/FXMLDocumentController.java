package oracle_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException {
        Parent scene2 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(scene2);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);  
        stage.setTitle("Login ");
        stage.show();
        System.out.println("Login Button is clicked");
}
    
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    } 

   
   
}
