package paint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaintApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/paint_application.fxml"));

        Scene scene = new Scene(root, 450, 475);

        stage.setTitle("Paint");
        stage.setScene(scene);
        stage.show();
    }


        public static void main (String[]args){
            launch(args);
        }

}

