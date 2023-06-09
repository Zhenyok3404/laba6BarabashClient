package com.example.laba6barabashclient;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class Controller {
    @FXML
    private Label Label;
    @FXML
    private TextField Field;
    private DataOutputStream out;
    @FXML
    protected void onButtonClick() {
        try{
            out.writeUTF(Field.getText());
            out.flush();
            Label.setText("Дані успішно відправлено!");
        }
        catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }

    public void setStreams(DataOutputStream out){
        this.out = out;
    }
}