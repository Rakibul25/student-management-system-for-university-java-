package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;


public class PreAdvisingController implements Initializable {

    @FXML
    private CheckBox cb1;
    @FXML
    private CheckBox cb2;
    @FXML
    private CheckBox cb3;
    @FXML
    private CheckBox cb4;
    @FXML
    private CheckBox cb5;
    @FXML
    private CheckBox cb6;
    @FXML
    private CheckBox cb7;
    @FXML
    private TextArea txt1;

    @FXML
    private CheckBox s1;
    @FXML
    private CheckBox s2;
    @FXML
    private CheckBox s3;
    @FXML
    private CheckBox s4;
    @FXML
    private CheckBox s5;
    @FXML
    private CheckBox s6;
    @FXML
    private CheckBox s7;
    @FXML
    private CheckBox s8;
    @FXML
    private CheckBox s9;
    @FXML
    private CheckBox s10;
    @FXML
    private CheckBox s11;
    @FXML
    private CheckBox s12;
    @FXML
    private CheckBox s13;
    @FXML
    private CheckBox s14;


    public void handlecheckbox1(ActionEvent e1)throws IOException {
        if (cb1.isSelected()) {
            if (s1.isSelected()) {
                txt1.appendText("Math, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);

                    writer.append("Math Sec - A(8.30-10.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s2.isSelected()) {
                txt1.appendText("Math, Section-B(10.00-11.30)\n");

                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Math Sec - B(10.00-11.30)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public void handlecheckbox2(ActionEvent e1)throws IOException {
        if (cb2.isSelected()) {
            if (s3.isSelected()) {
                txt1.appendText("Physics, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Physics Sec - A(8.30-1.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s4.isSelected()) {
                txt1.appendText("Physics, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Physics Sec - B(10.00-11.30)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }

        }
    }
    public void handlecheckbox3(ActionEvent e1)throws IOException {
        if (cb3.isSelected()) {
            if (s5.isSelected()) {
                txt1.appendText("OOP, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("OOP Sec - A(8.30-1.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s6.isSelected()) {
                txt1.appendText("OOP, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("OOP Sec - B(10.00-11.30");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }

        }
    }
    public void handlecheckbox4(ActionEvent e1)throws IOException{
        if(cb4.isSelected()) {
            if (s7.isSelected()) {
                txt1.appendText("OOP Lab, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("OOP Lab Sec - A(8.30-10.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
             if (s8.isSelected()){
                    txt1.appendText("OOP Lab, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt",true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("OOP Lab Sec - B(10.00-11.30");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public void handlecheckbox5(ActionEvent e1)throws IOException {
        if (cb5.isSelected()) {
            if (s9.isSelected()) {
                txt1.appendText("Algorithm, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Algorithm Sec - A(8.30-10.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s10.isSelected()) {
                txt1.appendText("Algorithm, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Algorithm Sec - B(10.00-11.30)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }
    public void handlecheckbox6(ActionEvent e1)throws IOException {
        if (cb6.isSelected()) {
            if (s11.isSelected()) {
                txt1.appendText("Accounting, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Accounting Sec - A(8.30-10.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s12.isSelected()) {
                txt1.appendText("Accounting, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Accounting Sec - B(10.00-11.30)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }
    public void handlecheckbox7(ActionEvent e1)throws IOException {
        if (cb7.isSelected()) {
            if (s13.isSelected()) {
                txt1.appendText("Data Structure, Section-A(8.30-10.00)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Data Structure Sec - A(8.30-10.00)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
            if (s14.isSelected()) {
                txt1.appendText("Data Structure, Section-B(10.00-11.30)\n");
                try {
                    FileWriter fw = new FileWriter("sec.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.append("Data Structure Sec - B(10.00-11.30)");
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public void Home(ActionEvent event)throws IOException {
        Parent paneParent = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene paneScene = new Scene(paneParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paneScene);
        window.show();
    }
    public void add(ActionEvent event)throws IOException{
        txt1.appendText("Succesfully added");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //hello
    }
}

