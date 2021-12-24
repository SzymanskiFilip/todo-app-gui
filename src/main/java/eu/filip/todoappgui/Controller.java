package eu.filip.todoappgui;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    @FXML
    private ListView<String> list;
    @FXML
    private TextField textField;
    @FXML
    private Button deleteButton;

    ArrayList<String> todoList = new ArrayList<>();
    String currentTodo;

    public void add(ActionEvent e){
        try{
            todoList.add(textField.getText());
            list.getItems().add(textField.getText());
            textField.setText("");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void delete(ActionEvent e){
        try{
            System.out.println("DELETING: " + currentTodo);
            list.getItems().remove(list.getItems().indexOf(currentTodo));
            todoList.remove(todoList.indexOf(currentTodo));
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
