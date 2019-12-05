package sample;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TextArea;

import java.io.IOException;

public class Routinecontroller {

    @FXML
    private TextArea t1;


    public void Home(ActionEvent event)throws IOException {
        Parent paneParent = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene paneScene = new Scene(paneParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paneScene);
        window.show();
    }
    public void Res(ActionEvent e2)throws IOException {
        try {
            FileReader fr = new FileReader("sec.txt");
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null){

                t1.appendText(line+"\n");
                }

            reader.close();
        }catch (IOException a){
        }
    }
}
