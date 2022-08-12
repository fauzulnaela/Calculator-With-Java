/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


/**
 *
 * @author zainu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    public Data data = new Data();
    
    @FXML 
    public String Operator;
    
    @FXML
    private TextField textFieldHasil;
    
    
    @FXML
    private void handleButtonSatu(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"1");
    }
    
    
    @FXML
    private void handleButtonDua(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"2");
    }
    
    @FXML
    private void handleButtonTiga(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"3");
    }
    
    @FXML
    private void handleButtonEmpat(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"4");
    }
    
    @FXML
    private void handleButtonLima(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"5");
    }
    
    @FXML
    private void handleButtonEnam(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"6");
    }
    
    @FXML
    private void handleButtonTujuh(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"7");
    }
    
        @FXML
    private void handleButtonDelapan(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"8");
    }
    
        @FXML
    private void handleButtonSembilan(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"9");
    }
    
        @FXML
    private void handleButtonNol(ActionEvent event) {
        textFieldHasil.setText(textFieldHasil.getText()+"0");
    }
    
    
    @FXML
    private void handleButtonPlus(ActionEvent event) {
       int sementara = Integer.parseInt(textFieldHasil.getText());
       data.setBilangan1(sementara);
       Operator = "+";
       textFieldHasil.setText("");
    } 
    
    
    @FXML
    private void handleButtonKurang(ActionEvent event) {
       int sementara = Integer.parseInt(textFieldHasil.getText());
       data.setBilangan1(sementara);
       Operator ="-";
       textFieldHasil.setText("");
              
    }
    
    @FXML
    private void handleButtonKali(ActionEvent event) {
       int sementara = Integer.parseInt(textFieldHasil.getText());
       data.setBilangan1(sementara);
       Operator ="*";
       textFieldHasil.setText("");
              
    }
    
    @FXML
    private void handleButtonBagi(ActionEvent event) {
       int sementara = Integer.parseInt(textFieldHasil.getText());
       data.setBilangan1(sementara);
       Operator ="/";
       textFieldHasil.setText("");
              
    }
    
    @FXML
    private void handleButtonClear(ActionEvent event) {
       int sementara = Integer.parseInt(textFieldHasil.getText());
       data.Clear();
       Operator ="null";
       textFieldHasil.setText("");
              
    }
    
    
    @FXML
    private void handleButtonSamaDengan(ActionEvent event) {
      int sementara = Integer.parseInt(textFieldHasil.getText());
      data.setBilangan2(sementara);

            switch (Operator) {
                case "+":
                    data.Penjumlahan();
                    break;
                case "-":
                    data.Pengurangan();
                    break;
                case "*":
                    data.Perkalian();
                    break;
                case "/":
                    data.Pembagian();
                    break;
               default:
                    textFieldHasil.setText("Pilih Operatornya");
                    break;
              }
         textFieldHasil.setText(String.valueOf(data.getHasil()));         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
