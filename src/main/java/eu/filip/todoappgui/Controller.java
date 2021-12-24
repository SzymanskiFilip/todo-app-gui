package eu.filip.todoappgui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<String> list;
    @FXML
    private TextField textField;

    ArrayList<String> todoList = new ArrayList<>();
    String currentTodo;

    public void add(ActionEvent e){
        try{
            System.out.println(textField.getText());
            todoList.add(textField.getText());
            list.getItems().add(textField.getText());
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list.getItems().addAll(todoList);
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentTodo = list.getSelectionModel().getSelectedItem();
                System.out.println(currentTodo);
            }
        });
    }
}
