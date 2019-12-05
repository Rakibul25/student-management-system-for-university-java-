package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentController {
    public void Home(ActionEvent event)throws IOException {
        Parent paneParent = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene paneScene = new Scene(paneParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paneScene);
        window.show();

    }
}
