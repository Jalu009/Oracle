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
import javafx.stage.Stage;


public class OrderController implements Initializable {

    @FXML
    private void BackButtonAction(ActionEvent event) throws IOException {
        Parent scene1 = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
        Scene scene = new Scene(scene1);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("back ");
        stage.show();
        System.out.println("Back Button is clicked");
}
    
     @FXML
     private void StoreButtonAction(ActionEvent event) throws IOException {
        Parent scene1 = FXMLLoader.load(getClass().getResource("Store.fxml"));
        Scene scene = new Scene(scene1);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Store ");
        stage.show();
        System.out.println("Store Button is clicked");
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
