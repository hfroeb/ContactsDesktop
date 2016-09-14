package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.text;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;

public void  addContact() {
    if (name.getText() != null || phone.getText() != null || email.getText() != null) {
        contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));
        name.setText("");
        phone.setText("");
        email.setText("");
    }
}

    public void removeContact(){
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }
    @Override
    public void initialize (URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}
