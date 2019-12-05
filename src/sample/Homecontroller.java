package sample;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.ChildLoader;
import com.sun.xml.internal.ws.wsdl.ActionBasedOperationSignature;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.AsyncBoxView;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;

public class Homecontroller implements Initializable{


    @FXML
    private MenuItem payment;
    @FXML
    private MenuItem preadvising;
    @FXML
    private MenuItem result;
    @FXML
    private MenuItem classroutine;

    Stage stage;
    @FXML Parent root;
    @FXML
    private void handlemenu(ActionEvent e1)throws IOException{

        if(e1.getSource()==payment){
            //get reference to the button's stage
            stage = (Stage) root.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("payment.fxml"));

            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if(e1.getSource()==preadvising){
            //get reference to the button's stage
            stage = (Stage) root.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("preadvising.fxml"));

            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        else if(e1.getSource()==result){
                //get reference to the button's stage
                stage = (Stage) root.getScene().getWindow();
                //load up OTHER FXML document
                root = FXMLLoader.load(getClass().getResource("result.fxml"));

                //create a new scene with root and set the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }

        else if(e1.getSource()==classroutine){
            //get reference to the button's stage
            stage = (Stage) root.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("routine.fxml"));

            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


    public void Logout(ActionEvent event) throws IOException {

        try {
            FileWriter fw = new FileWriter("sec.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("");
            writer.close();
        }catch (IOException e){
        }

        Parent gridparent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene gridScene = new Scene(gridparent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(gridScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //hello
    }
}

