package ch.zhaw.prog2.application;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainWindow.fxml"));
        Pane rootNode = loader.load();
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        MainWindowController mainWindowController = loader.getController();
        mainWindowController.connectProperties();
        stage.show();
    }
}
