package com.gruppo10.fileJava;

import com.gruppo10.controller.ProfiloRistoratoreController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProfiloRistoratore extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/profilo_ristoratore.fxml"));
        Parent root = loader.load();;

        ProfiloRistoratoreController controller = loader.getController();
        controller.setStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("The Knife - Profilo");
        // LoginController controller = new LoginController();
        // controller.setStage(stage); 
        stage.show();
    }

    // test main
    public static void main(String[] args) {
        launch(args);
    }
}