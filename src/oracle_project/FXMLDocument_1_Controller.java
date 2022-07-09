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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class FXMLDocument_1_Controller implements Initializable {
    
    @FXML
    private Label lName;
    
     @FXML
    private void OrderButtonAction(ActionEvent event) throws IOException {
        Parent scene2 = FXMLLoader.load(getClass().getResource("Order.fxml"));
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

public void getData(String a){
        lName.setText(a);
        System.out.println("getData method is Invoked");
}

}