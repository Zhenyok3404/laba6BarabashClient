package com.example.laba6barabashclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        int serverPort = 6666;
        String address = "127.0.0.1";
        InetAddress ipAddress = InetAddress.getByName(address);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Socket socket = new Socket(ipAddress, serverPort);
        OutputStream sout = socket.getOutputStream();
        DataOutputStream out = new DataOutputStream(sout);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Controller controller = fxmlLoader.getController();
        controller.setStreams(out);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}