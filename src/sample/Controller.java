package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
    @FXML
    TextField p1;
    @FXML
    TextField p2;


    public void Login(ActionEvent event) {
        try {
            FileReader fr = new FileReader("details.txt");
            BufferedReader reader = new BufferedReader(fr);

            String in1 = p1.getText();
            String in2 = p2.getText();

            String line = " ";
            String ch = " ";

            while ((line = reader.readLine()) != null){
                String [] sa = line.split(" ");
                String x1 = sa[0];
                String y = sa[1];
                if((in1.compareTo(sa[0]) == 0) && (in2.compareTo(sa[1]) == 0)){
                    Parent paneParent = FXMLLoader.load(getClass().getResource("home.fxml"));
                    Scene paneScene = new Scene(paneParent);

                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window.setScene(paneScene);
                    window.show();
                    break;
                }
            }
            reader.close();
            if (line == null){
                JOptionPane.showMessageDialog(null,"Sorry wrong password/user name!!","Title",JOptionPane.ERROR_MESSAGE);
            }
        }catch (IOException a){

        }
    }

}