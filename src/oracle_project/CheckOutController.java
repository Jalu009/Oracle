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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class CheckOutController implements Initializable {

     ItemList data;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfName;
    
    @FXML
    private TextField tfQuantityOrder;
    
    @FXML
    private RadioButton rbGallonOfWater;
    
    @FXML
    private RadioButton rbGallonsOfWaterAndMineralWater;
    
    @FXML
    private ChoiceBox cbDriver;
    
    @FXML
    private TableView<Item> tvItem;
    
    @FXML
    private TableColumn<Item, String> tcName;
    
    @FXML
    private TableColumn<Item,Integer> tcQuantityOrder;
    
    @FXML
    private TableColumn<Item,String> tcitem;
    
    @FXML
    private TableColumn<Item,String> tcDriver;
    
    @FXML
    private Label lblitem;
    
    @FXML
    private void addButtonAction(ActionEvent event) {
       
        String name = tfName.getText();
        String pn = tfQuantityOrder.getText();
        int pn2 = Integer.parseInt(pn);
        String item ="no choice";
        if(rbGallonOfWater.isSelected()){
            item ="Gallon Of Water";
        }
        else if(rbGallonsOfWaterAndMineralWater.isSelected()){
            item = "Gallons Of Water And Mineral Water";
        }
        String exp = cbDriver.getValue().toString();
        data.setData(name,pn2,item,exp);
        tvItem.setItems(data.getData());
        System.out.println("You clicked me!");
        label.setText("Check Out"); 
    }
    
     @FXML
    private void BackButtonAction(ActionEvent event) throws IOException {
        Parent scene1 = FXMLLoader.load(getClass().getResource("Store.fxml"));
        Scene scene = new Scene(scene1);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Back  ");
        stage.show();
        System.out.println("Back Button is clicked");
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        cbDriver.setValue("Driver");
        cbDriver.getItems().addAll("Delivered","Taken by myself");
       
        
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcQuantityOrder.setCellValueFactory(new PropertyValueFactory<>("quantityorder"));
        tcitem.setCellValueFactory(new PropertyValueFactory<>("item"));
        tcDriver.setCellValueFactory(new PropertyValueFactory<>("driver"));
        
        data = new ItemList();
        tvItem.setItems(data.getData());
    }    
        
    
}
