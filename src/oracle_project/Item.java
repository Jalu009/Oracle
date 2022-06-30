package oracle_project;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item {
     private SimpleStringProperty name;
    private SimpleIntegerProperty quantityorder;
    private SimpleStringProperty item;
    private SimpleStringProperty driver;
   
    
    public Item(){
        this("",0,"","");
    }
    public Item(String name, int quantityorder,String item, String driver){
        this.name = new SimpleStringProperty(name);
        this.quantityorder = new SimpleIntegerProperty(quantityorder);
        this.item = new SimpleStringProperty(item);
        this.driver = new SimpleStringProperty(driver);
       
    }
        public String getName(){
            return name.get();
        }
        public void setName(String name){
            this.name.set(name);
        }
        public int getQuantityorder(){
            return quantityorder.get();
        }
        public void setQuantityorder(int quantityorder){
            this.quantityorder.set(quantityorder);
        }
        public String getItem(){
            return item.get();
        }
        public void setItem(String item){
            this.item.set(item);
        }
        public String getDriver(){
            return driver.get();
        }
        public void setDriver(String driver){
            this.driver.set(driver);
        }
}
