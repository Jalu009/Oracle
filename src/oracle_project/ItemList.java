package oracle_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

        
public class ItemList {

    static void setText(String string) {
     
    }
    private ObservableList<Item> ItemList;
    
    public ItemList(){
        ItemList = FXCollections.observableArrayList();
    }
    public ObservableList<Item> getData(){
        return this.ItemList;
    }
    public void setData(String name, int quantityorder, String item, String Driver){
        ItemList.add(new Item(name, quantityorder, item, Driver));
    }
 

   
}
