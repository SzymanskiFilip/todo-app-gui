package eu.filip.todoappgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ListView<String> list;
    @FXML
    private TextField textField;

    public void add(ActionEvent e){
        try{
            System.out.println(textField.getText());
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
