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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginDocumentController implements Initializable {

   @FXML
    private TextField tfUsername;
    
    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument_1.fxml"));
        Parent scene2 = loader.load();
            
        FXMLDocument_1_Controller login = loader.getController();
        login.getData(tfUsername.getText());
        
        Stage stage = new Stage();
        stage.setScene(new Scene(scene2));
        stage.setTitle("Home Page");
        stage.show();
        System.out.println(tfUsername.getText());   
    }
    
   
    @FXML
    private void BackButtonAction(ActionEvent event) throws IOException {
        Parent scene1 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(scene1);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("back ");
        stage.show();
        System.out.println("Back Button is clicked");
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
   
}
